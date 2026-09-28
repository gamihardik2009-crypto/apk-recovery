package v;

import m.C0839l;
import m.C0841n;
import m2.C0880v;
import n2.AbstractC0961m;
import p.InterfaceC1012d0;
import t.C1210e;
import t.C1220o;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1356j extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1210e f11350i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11351j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f11352k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z2.p f11353l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1012d0 f11354m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z2.o f11355n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f11356o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f11357p;
    public final /* synthetic */ z2.q q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11358r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11359s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z2.s f11360t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356j(C1210e c1210e, int i2, float f3, z2.p pVar, InterfaceC1012d0 interfaceC1012d0, z2.o oVar, boolean z3, float f4, z2.q qVar, int i3, int i4, z2.s sVar) {
        super(1);
        this.f11350i = c1210e;
        this.f11351j = i2;
        this.f11352k = f3;
        this.f11353l = pVar;
        this.f11354m = interfaceC1012d0;
        this.f11355n = oVar;
        this.f11356o = z3;
        this.f11357p = f4;
        this.q = qVar;
        this.f11358r = i3;
        this.f11359s = i4;
        this.f11360t = sVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0839l c0839l = (C0839l) obj;
        C1210e c1210e = this.f11350i;
        int i2 = this.f11351j;
        boolean a3 = AbstractC1358l.a(c1210e, i2);
        z2.o oVar = this.f11355n;
        int i3 = this.f11359s;
        boolean z3 = this.f11356o;
        if (!a3) {
            float f3 = this.f11352k;
            float z4 = f3 > 0.0f ? B1.C.z(((Number) c0839l.f8512e.getValue()).floatValue(), f3) : B1.C.x(((Number) c0839l.f8512e.getValue()).floatValue(), f3);
            z2.p pVar = this.f11353l;
            float f4 = z4 - pVar.f11906h;
            float a4 = this.f11354m.a(f4);
            if (!AbstractC1358l.a(c1210e, i2) && !C1357k.r(z3, c1210e, i2, i3)) {
                if (f4 != a4) {
                    c0839l.a();
                    oVar.f11905h = false;
                    return C0880v.f8657a;
                }
                pVar.f11906h += f4;
                float f5 = this.f11357p;
                if (z3) {
                    if (((Number) c0839l.f8512e.getValue()).floatValue() > f5) {
                        c0839l.a();
                    }
                } else if (((Number) c0839l.f8512e.getValue()).floatValue() < (-f5)) {
                    c0839l.a();
                }
                int i4 = this.f11358r;
                z2.q qVar = this.q;
                if (z3) {
                    if (qVar.f11907h >= 2) {
                        C1220o c1220o = (C1220o) AbstractC0961m.N(c1210e.f10233a.h().f10296j);
                        if (i2 - (c1220o != null ? c1220o.f10303a : 0) > i4) {
                            c1210e.f10233a.k(i2 - i4, 0);
                        }
                    }
                } else if (qVar.f11907h >= 2 && c1210e.b() - i2 > i4) {
                    c1210e.f10233a.k(i4 + i2, 0);
                }
            }
        }
        if (C1357k.r(z3, c1210e, i2, i3)) {
            c1210e.f10233a.k(i2, i3);
            oVar.f11905h = false;
            c0839l.a();
        } else if (AbstractC1358l.a(c1210e, i2)) {
            throw new C1355i(B2.a.D(c1210e.a(i2)), (C0841n) this.f11360t.f11909h);
        }
        return C0880v.f8657a;
    }
}
