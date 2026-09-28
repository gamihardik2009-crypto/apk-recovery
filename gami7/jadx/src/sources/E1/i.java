package E1;

import B1.s;
import L1.o;
import L1.r;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1058h;

    /* renamed from: i, reason: collision with root package name */
    public final l f1059i;

    public /* synthetic */ i(l lVar, int i2) {
        this.f1058h = i2;
        this.f1059i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N1.a aVar;
        i iVar;
        boolean z3;
        boolean z4;
        switch (this.f1058h) {
            case 0:
                synchronized (this.f1059i.f1071n) {
                    l lVar = this.f1059i;
                    lVar.f1072o = (Intent) lVar.f1071n.get(0);
                }
                Intent intent = this.f1059i.f1072o;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f1059i.f1072o.getIntExtra("KEY_START_ID", 0);
                    s d3 = s.d();
                    String str = l.f1064r;
                    d3.a(str, "Processing command " + this.f1059i.f1072o + ", " + intExtra);
                    PowerManager.WakeLock a3 = r.a(this.f1059i.f1065h, action + " (" + intExtra + ")");
                    try {
                        s.d().a(str, "Acquiring operation wake lock (" + action + ") " + a3);
                        a3.acquire();
                        l lVar2 = this.f1059i;
                        lVar2.f1070m.a(intExtra, lVar2, lVar2.f1072o);
                        s.d().a(str, "Releasing operation wake lock (" + action + ") " + a3);
                        a3.release();
                        l lVar3 = this.f1059i;
                        aVar = lVar3.f1066i.f5013d;
                        iVar = new i(lVar3, 1);
                    } catch (Throwable th) {
                        try {
                            s d4 = s.d();
                            String str2 = l.f1064r;
                            d4.c(str2, "Unexpected error in onHandleIntent", th);
                            s.d().a(str2, "Releasing operation wake lock (" + action + ") " + a3);
                            a3.release();
                            l lVar4 = this.f1059i;
                            aVar = lVar4.f1066i.f5013d;
                            iVar = new i(lVar4, 1);
                        } catch (Throwable th2) {
                            s.d().a(l.f1064r, "Releasing operation wake lock (" + action + ") " + a3);
                            a3.release();
                            l lVar5 = this.f1059i;
                            lVar5.f1066i.f5013d.execute(new i(lVar5, 1));
                            throw th2;
                        }
                    }
                    aVar.execute(iVar);
                    return;
                }
                return;
            default:
                l lVar6 = this.f1059i;
                lVar6.getClass();
                s d5 = s.d();
                String str3 = l.f1064r;
                d5.a(str3, "Checking if commands are complete.");
                l.b();
                synchronized (lVar6.f1071n) {
                    try {
                        if (lVar6.f1072o != null) {
                            s.d().a(str3, "Removing command " + lVar6.f1072o);
                            if (!((Intent) lVar6.f1071n.remove(0)).equals(lVar6.f1072o)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            lVar6.f1072o = null;
                        }
                        o oVar = lVar6.f1066i.f5010a;
                        c cVar = lVar6.f1070m;
                        synchronized (cVar.f1029j) {
                            z3 = !cVar.f1028i.isEmpty();
                        }
                        if (!z3 && lVar6.f1071n.isEmpty()) {
                            synchronized (oVar.f4659l) {
                                z4 = !oVar.f4657j.isEmpty();
                            }
                            if (!z4) {
                                s.d().a(str3, "No more commands & intents.");
                                k kVar = lVar6.f1073p;
                                if (kVar != null) {
                                    ((SystemAlarmService) kVar).a();
                                }
                            }
                        }
                        if (!lVar6.f1071n.isEmpty()) {
                            lVar6.c();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
