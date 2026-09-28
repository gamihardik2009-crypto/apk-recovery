package i0;

import B.F;
import a.AbstractC0423a;
import c0.AbstractC0571K;
import c0.AbstractC0598q;
import c0.C0565E;
import c0.C0578S;
import c0.C0591j;
import c0.C0603v;
import e0.InterfaceC0654d;
import java.util.ArrayList;
import java.util.List;
import n2.C0970v;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709b extends AbstractC0728u {

    /* renamed from: b, reason: collision with root package name */
    public float[] f7831b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7832c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f7833d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f7834e = C0603v.f7277g;

    /* renamed from: f, reason: collision with root package name */
    public List f7835f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7836g;

    /* renamed from: h, reason: collision with root package name */
    public C0591j f7837h;

    /* renamed from: i, reason: collision with root package name */
    public y2.c f7838i;

    /* renamed from: j, reason: collision with root package name */
    public final A0.n f7839j;

    /* renamed from: k, reason: collision with root package name */
    public String f7840k;

    /* renamed from: l, reason: collision with root package name */
    public float f7841l;

    /* renamed from: m, reason: collision with root package name */
    public float f7842m;

    /* renamed from: n, reason: collision with root package name */
    public float f7843n;

    /* renamed from: o, reason: collision with root package name */
    public float f7844o;

    /* renamed from: p, reason: collision with root package name */
    public float f7845p;
    public float q;

    /* renamed from: r, reason: collision with root package name */
    public float f7846r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7847s;

    public C0709b() {
        int i2 = AbstractC0732y.f7958a;
        this.f7835f = C0970v.f9165h;
        this.f7836g = true;
        this.f7839j = new A0.n(24, this);
        this.f7840k = "";
        this.f7844o = 1.0f;
        this.f7845p = 1.0f;
        this.f7847s = true;
    }

    @Override // i0.AbstractC0728u
    public final void a(InterfaceC0654d interfaceC0654d) {
        if (this.f7847s) {
            float[] fArr = this.f7831b;
            if (fArr == null) {
                fArr = C0565E.a();
                this.f7831b = fArr;
            } else {
                C0565E.d(fArr);
            }
            C0565E.h(this.q + this.f7842m, this.f7846r + this.f7843n, 0.0f, fArr);
            C0565E.e(fArr, this.f7841l);
            C0565E.f(this.f7844o, this.f7845p, 1.0f, fArr);
            C0565E.h(-this.f7842m, -this.f7843n, 0.0f, fArr);
            this.f7847s = false;
        }
        if (this.f7836g) {
            if (!this.f7835f.isEmpty()) {
                C0591j c0591j = this.f7837h;
                if (c0591j == null) {
                    c0591j = AbstractC0571K.h();
                    this.f7837h = c0591j;
                }
                AbstractC0423a.c0(this.f7835f, c0591j);
            }
            this.f7836g = false;
        }
        K1.m e02 = interfaceC0654d.e0();
        long j3 = e02.j();
        e02.e().f();
        try {
            F f3 = (F) e02.f4558a;
            float[] fArr2 = this.f7831b;
            if (fArr2 != null) {
                ((K1.m) f3.f165i).e().n(fArr2);
            }
            C0591j c0591j2 = this.f7837h;
            if ((!this.f7835f.isEmpty()) && c0591j2 != null) {
                ((K1.m) f3.f165i).e().d(c0591j2, 1);
            }
            ArrayList arrayList = this.f7832c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC0728u) arrayList.get(i2)).a(interfaceC0654d);
            }
        } finally {
            e02.e().b();
            e02.r(j3);
        }
    }

    @Override // i0.AbstractC0728u
    public final y2.c b() {
        return this.f7838i;
    }

    @Override // i0.AbstractC0728u
    public final void d(A0.n nVar) {
        this.f7838i = nVar;
    }

    public final void e(int i2, AbstractC0728u abstractC0728u) {
        ArrayList arrayList = this.f7832c;
        if (i2 < arrayList.size()) {
            arrayList.set(i2, abstractC0728u);
        } else {
            arrayList.add(abstractC0728u);
        }
        g(abstractC0728u);
        abstractC0728u.d(this.f7839j);
        c();
    }

    public final void f(long j3) {
        if (this.f7833d && j3 != 16) {
            long j4 = this.f7834e;
            if (j4 == 16) {
                this.f7834e = j3;
                return;
            }
            int i2 = AbstractC0732y.f7958a;
            if (C0603v.h(j4) == C0603v.h(j3) && C0603v.g(j4) == C0603v.g(j3) && C0603v.e(j4) == C0603v.e(j3)) {
                return;
            }
            this.f7833d = false;
            this.f7834e = C0603v.f7277g;
        }
    }

    public final void g(AbstractC0728u abstractC0728u) {
        if (!(abstractC0728u instanceof C0714g)) {
            if (abstractC0728u instanceof C0709b) {
                C0709b c0709b = (C0709b) abstractC0728u;
                if (c0709b.f7833d && this.f7833d) {
                    f(c0709b.f7834e);
                    return;
                } else {
                    this.f7833d = false;
                    this.f7834e = C0603v.f7277g;
                    return;
                }
            }
            return;
        }
        C0714g c0714g = (C0714g) abstractC0728u;
        AbstractC0598q abstractC0598q = c0714g.f7884b;
        if (this.f7833d && abstractC0598q != null) {
            if (abstractC0598q instanceof C0578S) {
                f(((C0578S) abstractC0598q).f7238a);
            } else {
                this.f7833d = false;
                this.f7834e = C0603v.f7277g;
            }
        }
        AbstractC0598q abstractC0598q2 = c0714g.f7889g;
        if (this.f7833d && abstractC0598q2 != null) {
            if (abstractC0598q2 instanceof C0578S) {
                f(((C0578S) abstractC0598q2).f7238a);
            } else {
                this.f7833d = false;
                this.f7834e = C0603v.f7277g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f7840k);
        ArrayList arrayList = this.f7832c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0728u abstractC0728u = (AbstractC0728u) arrayList.get(i2);
            sb.append("\t");
            sb.append(abstractC0728u.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
