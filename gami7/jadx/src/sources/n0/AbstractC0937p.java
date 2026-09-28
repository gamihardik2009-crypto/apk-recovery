package n0;

/* renamed from: n0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0937p {

    /* renamed from: a, reason: collision with root package name */
    public static final C0922a f8955a = new C0922a(1000);

    static {
        new C0922a(1007);
        new C0922a(1008);
        new C0922a(1002);
    }

    public static final boolean a(r rVar) {
        return !rVar.f8964h && rVar.f8960d;
    }

    public static final boolean b(r rVar) {
        return (rVar.b() || !rVar.f8964h || rVar.f8960d) ? false : true;
    }

    public static final boolean c(r rVar) {
        return rVar.f8964h && !rVar.f8960d;
    }

    public static final boolean d(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean e(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean f(r rVar, long j3) {
        long j4 = rVar.f8959c;
        float d3 = b0.c.d(j4);
        float e3 = b0.c.e(j4);
        return d3 < 0.0f || d3 > ((float) ((int) (j3 >> 32))) || e3 < 0.0f || e3 > ((float) ((int) (j3 & 4294967295L)));
    }

    public static final boolean g(r rVar, long j3, long j4) {
        if (!e(rVar.f8965i, 1)) {
            return f(rVar, j3);
        }
        long j5 = rVar.f8959c;
        float d3 = b0.c.d(j5);
        float e3 = b0.c.e(j5);
        return d3 < (-b0.f.d(j4)) || d3 > b0.f.d(j4) + ((float) ((int) (j3 >> 32))) || e3 < (-b0.f.b(j4)) || e3 > b0.f.b(j4) + ((float) ((int) (j3 & 4294967295L)));
    }

    public static final long h(r rVar, boolean z3) {
        long g3 = b0.c.g(rVar.f8959c, rVar.f8963g);
        if (z3 || !rVar.b()) {
            return g3;
        }
        return 0L;
    }
}
