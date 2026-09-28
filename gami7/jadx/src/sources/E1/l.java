package E1;

import B1.C0011a;
import B1.s;
import C1.w;
import L1.r;
import L1.z;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements C1.d {

    /* renamed from: r, reason: collision with root package name */
    public static final String f1064r = s.f("SystemAlarmDispatcher");

    /* renamed from: h, reason: collision with root package name */
    public final Context f1065h;

    /* renamed from: i, reason: collision with root package name */
    public final N1.b f1066i;

    /* renamed from: j, reason: collision with root package name */
    public final z f1067j;

    /* renamed from: k, reason: collision with root package name */
    public final C1.i f1068k;

    /* renamed from: l, reason: collision with root package name */
    public final w f1069l;

    /* renamed from: m, reason: collision with root package name */
    public final c f1070m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1071n;

    /* renamed from: o, reason: collision with root package name */
    public Intent f1072o;

    /* renamed from: p, reason: collision with root package name */
    public k f1073p;
    public final K1.e q;

    public l(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1065h = applicationContext;
        K1.c cVar = new K1.c(1);
        w o02 = w.o0(context);
        this.f1069l = o02;
        C0011a c0011a = o02.f689g;
        this.f1070m = new c(applicationContext, c0011a.f262c, cVar);
        this.f1067j = new z(c0011a.f265f);
        C1.i iVar = o02.f693k;
        this.f1068k = iVar;
        N1.b bVar = o02.f691i;
        this.f1066i = bVar;
        this.q = new K1.e(iVar, bVar);
        iVar.a(this);
        this.f1071n = new ArrayList();
        this.f1072o = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i2) {
        s d3 = s.d();
        String str = f1064r;
        d3.a(str, "Adding command " + intent + " (" + i2 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            s.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f1071n) {
                try {
                    Iterator it = this.f1071n.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.f1071n) {
            try {
                boolean z3 = !this.f1071n.isEmpty();
                this.f1071n.add(intent);
                if (!z3) {
                    c();
                }
            } finally {
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock a3 = r.a(this.f1065h, "ProcessCommand");
        try {
            a3.acquire();
            this.f1069l.f691i.a(new i(this, 0));
        } finally {
            a3.release();
        }
    }

    @Override // C1.d
    public final void e(K1.j jVar, boolean z3) {
        N1.a aVar = this.f1066i.f5013d;
        String str = c.f1026m;
        Intent intent = new Intent(this.f1065h, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z3);
        c.c(intent, jVar);
        aVar.execute(new j(0, this, intent));
    }
}
