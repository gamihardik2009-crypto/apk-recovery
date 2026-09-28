package u;

import H.U2;
import J.C0257c;
import J.C0274k0;
import J.InterfaceC0258c0;
import J.W;
import T.AbstractC0379g;
import java.util.ArrayList;
import java.util.List;
import m2.C0865g;
import m2.C0880v;
import n.c0;
import n0.C0919B;
import n0.C0929h;
import n2.AbstractC0960l;
import n2.AbstractC0961m;
import n2.AbstractC0962n;
import p.InterfaceC1047v0;
import p.X;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import t.C1206a;
import t.C1221p;
import t.C1223r;
import t0.C1236E;
import v.C1334F;
import v.C1337I;
import v.C1350d;
import v.InterfaceC1336H;

/* loaded from: classes.dex */
public final class x implements InterfaceC1047v0 {

    /* renamed from: t, reason: collision with root package name */
    public static final K1.e f10794t = K1.f.I(g.f10689k, o.f10738l);

    /* renamed from: b, reason: collision with root package name */
    public final C1221p f10796b;

    /* renamed from: e, reason: collision with root package name */
    public float f10799e;

    /* renamed from: h, reason: collision with root package name */
    public C1236E f10802h;

    /* renamed from: m, reason: collision with root package name */
    public final C1337I f10807m;

    /* renamed from: r, reason: collision with root package name */
    public final C0274k0 f10811r;

    /* renamed from: s, reason: collision with root package name */
    public final C0274k0 f10812s;

    /* renamed from: a, reason: collision with root package name */
    public final C1206a f10795a = new C1206a(2, 1);

    /* renamed from: c, reason: collision with root package name */
    public final C0274k0 f10797c = C0257c.N(y.f10813a, W.f4106j);

    /* renamed from: d, reason: collision with root package name */
    public final r.l f10798d = new r.l();

    /* renamed from: f, reason: collision with root package name */
    public final p.r f10800f = new p.r(new C0919B(12, this));

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10801g = true;

    /* renamed from: i, reason: collision with root package name */
    public final C1223r f10803i = new C1223r(this, 1);

    /* renamed from: j, reason: collision with root package name */
    public final C1350d f10804j = new C1350d();

    /* renamed from: k, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f10805k = new androidx.compose.foundation.lazy.layout.a();

    /* renamed from: l, reason: collision with root package name */
    public final C0929h f10806l = new C0929h(2);

    /* renamed from: n, reason: collision with root package name */
    public final u f10808n = new u(this);

    /* renamed from: o, reason: collision with root package name */
    public final C1334F f10809o = new C1334F();

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0258c0 f10810p = AbstractC0960l.h();
    public final InterfaceC0258c0 q = AbstractC0960l.h();

    public x(int i2, int i3) {
        this.f10796b = new C1221p(i2, i3, 1);
        this.f10807m = new C1337I(new U2(i2, 4, this));
        Boolean bool = Boolean.FALSE;
        W w2 = W.f4109m;
        this.f10811r = C0257c.N(bool, w2);
        this.f10812s = C0257c.N(bool, w2);
    }

    public static Object i(x xVar, int i2, InterfaceC1073d interfaceC1073d) {
        xVar.getClass();
        Object e3 = xVar.e(c0.f8753h, new w(xVar, i2, 0, null), interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }

    @Override // p.InterfaceC1047v0
    public final boolean a() {
        return ((Boolean) this.f10811r.getValue()).booleanValue();
    }

    @Override // p.InterfaceC1047v0
    public final float b(float f3) {
        return this.f10800f.b(f3);
    }

    @Override // p.InterfaceC1047v0
    public final boolean c() {
        return ((Boolean) this.f10812s.getValue()).booleanValue();
    }

    @Override // p.InterfaceC1047v0
    public final boolean d() {
        return this.f10800f.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // p.InterfaceC1047v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(n.c0 r6, y2.e r7, q2.InterfaceC1073d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof u.v
            if (r0 == 0) goto L13
            r0 = r8
            u.v r0 = (u.v) r0
            int r1 = r0.f10790p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10790p = r1
            goto L18
        L13:
            u.v r0 = new u.v
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f10788n
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f10790p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            C1.y.J(r8)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            y2.e r7 = r0.f10787m
            n.c0 r6 = r0.f10786l
            u.x r2 = r0.f10785k
            C1.y.J(r8)
            goto L51
        L3c:
            C1.y.J(r8)
            r0.f10785k = r5
            r0.f10786l = r6
            r0.f10787m = r7
            r0.f10790p = r4
            v.d r8 = r5.f10804j
            java.lang.Object r8 = r8.l(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            p.r r8 = r2.f10800f
            r2 = 0
            r0.f10785k = r2
            r0.f10786l = r2
            r0.f10787m = r2
            r0.f10790p = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            m2.v r6 = m2.C0880v.f8657a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u.x.e(n.c0, y2.e, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(u.p r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.x.f(u.p, boolean):void");
    }

    public final p g() {
        return (p) this.f10797c.getValue();
    }

    public final void h(float f3, p pVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f10801g) {
            C1206a c1206a = this.f10795a;
            c1206a.getClass();
            if (!pVar.f10747g.isEmpty()) {
                boolean z3 = f3 < 0.0f;
                X x2 = X.f9518h;
                X x3 = pVar.f10751k;
                List list = pVar.f10747g;
                if (z3) {
                    q qVar = (q) AbstractC0961m.M(list);
                    i2 = (x3 == x2 ? qVar.f10771r : qVar.f10772s) + 1;
                    i3 = ((q) AbstractC0961m.M(list)).f10755a + 1;
                } else {
                    q qVar2 = (q) AbstractC0961m.G(list);
                    i2 = (x3 == x2 ? qVar2.f10771r : qVar2.f10772s) - 1;
                    i3 = ((q) AbstractC0961m.G(list)).f10755a - 1;
                }
                if (i3 < 0 || i3 >= pVar.f10750j) {
                    return;
                }
                int i7 = c1206a.f10215b;
                L.d dVar = (L.d) c1206a.f10217d;
                if (i2 != i7) {
                    if (c1206a.f10216c != z3 && (i6 = dVar.f4620j) > 0) {
                        Object[] objArr = dVar.f4618h;
                        int i8 = 0;
                        do {
                            ((InterfaceC1336H) objArr[i8]).cancel();
                            i8++;
                        } while (i8 < i6);
                    }
                    c1206a.f10216c = z3;
                    c1206a.f10215b = i2;
                    dVar.g();
                    u uVar = this.f10808n;
                    uVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    x xVar = (x) uVar.f10784a;
                    AbstractC0379g c3 = T.s.c();
                    y2.c f4 = c3 != null ? c3.f() : null;
                    AbstractC0379g d3 = T.s.d(c3);
                    try {
                        List list2 = (List) ((p) xVar.f10797c.getValue()).f10746f.l(Integer.valueOf(i2));
                        int size = list2.size();
                        int i9 = 0;
                        while (i9 < size) {
                            C0865g c0865g = (C0865g) list2.get(i9);
                            List list3 = list2;
                            x xVar2 = xVar;
                            arrayList.add(xVar.f10807m.a(((O0.a) c0865g.f8647i).f5132a, ((Number) c0865g.f8646h).intValue()));
                            i9++;
                            list2 = list3;
                            xVar = xVar2;
                        }
                        T.s.f(c3, d3, f4);
                        dVar.d(dVar.f4620j, arrayList);
                    } catch (Throwable th) {
                        T.s.f(c3, d3, f4);
                        throw th;
                    }
                }
                if (!z3) {
                    if (pVar.f10748h - AbstractC0962n.m((q) AbstractC0961m.G(list), x3) >= f3 || (i4 = dVar.f4620j) <= 0) {
                        return;
                    }
                    Object[] objArr2 = dVar.f4618h;
                    int i10 = 0;
                    do {
                        ((InterfaceC1336H) objArr2[i10]).a();
                        i10++;
                    } while (i10 < i4);
                    return;
                }
                q qVar3 = (q) AbstractC0961m.M(list);
                if (((AbstractC0962n.m(qVar3, x3) + ((int) (x3 == x2 ? qVar3.f10770p & 4294967295L : qVar3.f10770p >> 32))) + pVar.f10753m) - pVar.f10749i >= (-f3) || (i5 = dVar.f4620j) <= 0) {
                    return;
                }
                Object[] objArr3 = dVar.f4618h;
                int i11 = 0;
                do {
                    ((InterfaceC1336H) objArr3[i11]).a();
                    i11++;
                } while (i11 < i5);
            }
        }
    }
}
