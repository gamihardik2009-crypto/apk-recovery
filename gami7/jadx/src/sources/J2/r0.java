package J2;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4425a = new ThreadLocal();

    public static Q a() {
        ThreadLocal threadLocal = f4425a;
        Q q = (Q) threadLocal.get();
        if (q != null) {
            return q;
        }
        C0307d c0307d = new C0307d(Thread.currentThread());
        threadLocal.set(c0307d);
        return c0307d;
    }
}
