package T;

/* renamed from: T.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0379g {

    /* renamed from: a, reason: collision with root package name */
    public l f5685a;

    /* renamed from: b, reason: collision with root package name */
    public int f5686b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5687c;

    /* renamed from: d, reason: collision with root package name */
    public int f5688d;

    public AbstractC0379g(int i2, l lVar) {
        int i3;
        int numberOfTrailingZeros;
        this.f5685a = lVar;
        this.f5686b = i2;
        if (i2 != 0) {
            l e3 = e();
            K1.m mVar = n.f5709a;
            int[] iArr = e3.f5705k;
            if (iArr != null) {
                i2 = iArr[0];
            } else {
                long j3 = e3.f5703i;
                int i4 = e3.f5704j;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = e3.f5702h;
                    if (j4 != 0) {
                        i4 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                i2 = numberOfTrailingZeros + i4;
            }
            synchronized (n.f5710b) {
                i3 = n.f5713e.a(i2);
            }
        } else {
            i3 = -1;
        }
        this.f5688d = i3;
    }

    public static void p(AbstractC0379g abstractC0379g) {
        n.f5709a.m(abstractC0379g);
    }

    public final void a() {
        synchronized (n.f5710b) {
            b();
            o();
        }
    }

    public void b() {
        n.f5711c = n.f5711c.b(d());
    }

    public abstract void c();

    public int d() {
        return this.f5686b;
    }

    public l e() {
        return this.f5685a;
    }

    public abstract y2.c f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract y2.c i();

    public final AbstractC0379g j() {
        K1.m mVar = n.f5709a;
        AbstractC0379g abstractC0379g = (AbstractC0379g) mVar.d();
        mVar.m(this);
        return abstractC0379g;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(A a3);

    public void o() {
        int i2 = this.f5688d;
        if (i2 >= 0) {
            n.u(i2);
            this.f5688d = -1;
        }
    }

    public void q(int i2) {
        this.f5686b = i2;
    }

    public void r(l lVar) {
        this.f5685a = lVar;
    }

    public void s(int i2) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract AbstractC0379g t(y2.c cVar);
}
