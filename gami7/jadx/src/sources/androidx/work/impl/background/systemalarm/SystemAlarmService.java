package androidx.work.impl.background.systemalarm;

import B1.s;
import E1.k;
import E1.l;
import L1.r;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0473w;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0473w implements k {

    /* renamed from: k, reason: collision with root package name */
    public static final String f6950k = s.f("SystemAlarmService");

    /* renamed from: i, reason: collision with root package name */
    public l f6951i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6952j;

    public final void a() {
        this.f6952j = true;
        s.d().a(f6950k, "All commands completed in dispatcher");
        String str = r.f4664a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (L1.s.f4665a) {
            linkedHashMap.putAll(L1.s.f4666b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                s.d().g(r.f4664a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0473w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        l lVar = new l(this);
        this.f6951i = lVar;
        if (lVar.f1073p != null) {
            s.d().b(l.f1064r, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            lVar.f1073p = this;
        }
        this.f6952j = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0473w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f6952j = true;
        l lVar = this.f6951i;
        lVar.getClass();
        s.d().a(l.f1064r, "Destroying SystemAlarmDispatcher");
        lVar.f1068k.f(lVar);
        lVar.f1073p = null;
    }

    @Override // androidx.lifecycle.AbstractServiceC0473w, android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f6952j) {
            s.d().e(f6950k, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            l lVar = this.f6951i;
            lVar.getClass();
            s d3 = s.d();
            String str = l.f1064r;
            d3.a(str, "Destroying SystemAlarmDispatcher");
            lVar.f1068k.f(lVar);
            lVar.f1073p = null;
            l lVar2 = new l(this);
            this.f6951i = lVar2;
            if (lVar2.f1073p != null) {
                s.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                lVar2.f1073p = this;
            }
            this.f6952j = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f6951i.a(intent, i3);
        return 3;
    }
}
