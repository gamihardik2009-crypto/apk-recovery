package L1;

import B.F;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: e, reason: collision with root package name */
    public static final String f4684e = B1.s.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final F f4685a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4686b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4687c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f4688d = new Object();

    public z(F f3) {
        this.f4685a = f3;
    }

    public final void a(K1.j jVar) {
        synchronized (this.f4688d) {
            try {
                if (((y) this.f4686b.remove(jVar)) != null) {
                    B1.s.d().a(f4684e, "Stopping timer for " + jVar);
                    this.f4687c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
