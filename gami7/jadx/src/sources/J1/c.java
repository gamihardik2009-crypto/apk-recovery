package J1;

import B1.s;
import C1.w;
import C1.y;
import G1.i;
import J2.Z;
import K1.j;
import K1.o;
import L1.p;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import z2.h;

/* loaded from: classes.dex */
public final class c implements G1.e, C1.d {
    public static final String q = s.f("SystemFgDispatcher");

    /* renamed from: h, reason: collision with root package name */
    public final w f4326h;

    /* renamed from: i, reason: collision with root package name */
    public final N1.b f4327i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4328j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public j f4329k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f4330l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f4331m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f4332n;

    /* renamed from: o, reason: collision with root package name */
    public final i f4333o;

    /* renamed from: p, reason: collision with root package name */
    public b f4334p;

    public c(Context context) {
        w o02 = w.o0(context);
        this.f4326h = o02;
        this.f4327i = o02.f691i;
        this.f4329k = null;
        this.f4330l = new LinkedHashMap();
        this.f4332n = new HashMap();
        this.f4331m = new HashMap();
        this.f4333o = new i(o02.f697o);
        o02.f693k.a(this);
    }

    public static Intent b(Context context, j jVar, B1.i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f294a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f295b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f296c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f4551a);
        intent.putExtra("KEY_GENERATION", jVar.f4552b);
        return intent;
    }

    public static Intent c(Context context, j jVar, B1.i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f4551a);
        intent.putExtra("KEY_GENERATION", jVar.f4552b);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f294a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f295b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f296c);
        return intent;
    }

    @Override // G1.e
    public final void a(o oVar, G1.c cVar) {
        if (cVar instanceof G1.b) {
            String str = oVar.f4564a;
            s.d().a(q, "Constraints unmet for WorkSpec " + str);
            j v3 = y.v(oVar);
            w wVar = this.f4326h;
            wVar.getClass();
            C1.o oVar2 = new C1.o(v3);
            C1.i iVar = wVar.f693k;
            h.f(iVar, "processor");
            wVar.f691i.a(new p(iVar, oVar2, true, -512));
        }
    }

    public final void d(Intent intent) {
        int i2 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        s.d().a(q, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f4334p == null) {
            return;
        }
        B1.i iVar = new B1.i(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f4330l;
        linkedHashMap.put(jVar, iVar);
        if (this.f4329k == null) {
            this.f4329k = jVar;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.f4334p;
            systemForegroundService.f6960i.post(new d(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f4334p;
        systemForegroundService2.f6960i.post(new E1.j(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i2 |= ((B1.i) ((Map.Entry) it.next()).getValue()).f295b;
        }
        B1.i iVar2 = (B1.i) linkedHashMap.get(this.f4329k);
        if (iVar2 != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f4334p;
            systemForegroundService3.f6960i.post(new d(systemForegroundService3, iVar2.f294a, iVar2.f296c, i2));
        }
    }

    @Override // C1.d
    public final void e(j jVar, boolean z3) {
        Map.Entry entry;
        synchronized (this.f4328j) {
            try {
                Z z4 = ((o) this.f4331m.remove(jVar)) != null ? (Z) this.f4332n.remove(jVar) : null;
                if (z4 != null) {
                    z4.a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        B1.i iVar = (B1.i) this.f4330l.remove(jVar);
        if (jVar.equals(this.f4329k)) {
            if (this.f4330l.size() > 0) {
                Iterator it = this.f4330l.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f4329k = (j) entry.getKey();
                if (this.f4334p != null) {
                    B1.i iVar2 = (B1.i) entry.getValue();
                    SystemForegroundService systemForegroundService = (SystemForegroundService) this.f4334p;
                    systemForegroundService.f6960i.post(new d(systemForegroundService, iVar2.f294a, iVar2.f296c, iVar2.f295b));
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f4334p;
                    systemForegroundService2.f6960i.post(new e(systemForegroundService2, iVar2.f294a));
                }
            } else {
                this.f4329k = null;
            }
        }
        b bVar = this.f4334p;
        if (iVar == null || bVar == null) {
            return;
        }
        s.d().a(q, "Removing Notification (id: " + iVar.f294a + ", workSpecId: " + jVar + ", notificationType: " + iVar.f295b);
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) bVar;
        systemForegroundService3.f6960i.post(new e(systemForegroundService3, iVar.f294a));
    }

    public final void f() {
        this.f4334p = null;
        synchronized (this.f4328j) {
            try {
                Iterator it = this.f4332n.values().iterator();
                while (it.hasNext()) {
                    ((Z) it.next()).a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4326h.f693k.f(this);
    }
}
