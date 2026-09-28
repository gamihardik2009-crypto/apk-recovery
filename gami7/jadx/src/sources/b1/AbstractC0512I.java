package b1;

/* renamed from: b1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0512I {

    /* renamed from: a, reason: collision with root package name */
    public final C0521S f7092a;

    /* renamed from: b, reason: collision with root package name */
    public W0.b[] f7093b;

    public AbstractC0512I() {
        this(new C0521S());
    }

    public final void a() {
        W0.b[] bVarArr = this.f7093b;
        if (bVarArr != null) {
            W0.b bVar = bVarArr[C1.y.C(1)];
            W0.b bVar2 = this.f7093b[C1.y.C(2)];
            C0521S c0521s = this.f7092a;
            if (bVar2 == null) {
                bVar2 = c0521s.f7111a.f(2);
            }
            if (bVar == null) {
                bVar = c0521s.f7111a.f(1);
            }
            g(W0.b.a(bVar, bVar2));
            W0.b bVar3 = this.f7093b[C1.y.C(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            W0.b bVar4 = this.f7093b[C1.y.C(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            W0.b bVar5 = this.f7093b[C1.y.C(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract C0521S b();

    public void c(int i2, W0.b bVar) {
        if (this.f7093b == null) {
            this.f7093b = new W0.b[9];
        }
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                this.f7093b[C1.y.C(i3)] = bVar;
            }
        }
    }

    public void d(W0.b bVar) {
    }

    public abstract void e(W0.b bVar);

    public void f(W0.b bVar) {
    }

    public abstract void g(W0.b bVar);

    public void h(W0.b bVar) {
    }

    public AbstractC0512I(C0521S c0521s) {
        this.f7092a = c0521s;
    }
}
