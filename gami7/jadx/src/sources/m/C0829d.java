package m;

import J.C0257c;
import J.C0274k0;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829d {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f8422a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8423b;

    /* renamed from: c, reason: collision with root package name */
    public final C0841n f8424c;

    /* renamed from: d, reason: collision with root package name */
    public final C0274k0 f8425d;

    /* renamed from: e, reason: collision with root package name */
    public final C0274k0 f8426e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8427f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8428g;

    /* renamed from: h, reason: collision with root package name */
    public final J f8429h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0845s f8430i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0845s f8431j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0845s f8432k;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0845s f8433l;

    public C0829d(Object obj, x0 x0Var, Object obj2) {
        this.f8422a = x0Var;
        this.f8423b = obj2;
        C0841n c0841n = new C0841n(x0Var, obj, null, 60);
        this.f8424c = c0841n;
        Boolean bool = Boolean.FALSE;
        J.W w2 = J.W.f4109m;
        this.f8425d = C0257c.N(bool, w2);
        this.f8426e = C0257c.N(obj, w2);
        this.f8429h = new J();
        new Z(obj2);
        AbstractC0845s abstractC0845s = c0841n.f8535j;
        boolean z3 = abstractC0845s instanceof C0842o;
        AbstractC0845s abstractC0845s2 = z3 ? AbstractC0831e.f8440e : abstractC0845s instanceof C0843p ? AbstractC0831e.f8441f : abstractC0845s instanceof C0844q ? AbstractC0831e.f8442g : AbstractC0831e.f8443h;
        this.f8430i = abstractC0845s2;
        AbstractC0845s abstractC0845s3 = z3 ? AbstractC0831e.f8436a : abstractC0845s instanceof C0843p ? AbstractC0831e.f8437b : abstractC0845s instanceof C0844q ? AbstractC0831e.f8438c : AbstractC0831e.f8439d;
        this.f8431j = abstractC0845s3;
        this.f8432k = abstractC0845s2;
        this.f8433l = abstractC0845s3;
    }

    public static final void a(C0829d c0829d) {
        C0841n c0841n = c0829d.f8424c;
        c0841n.f8535j.d();
        c0841n.f8536k = Long.MIN_VALUE;
        c0829d.f8425d.setValue(Boolean.FALSE);
    }

    public static Object b(C0829d c0829d, Object obj, InterfaceC0840m interfaceC0840m, y2.c cVar, InterfaceC1073d interfaceC1073d, int i2) {
        Object l3 = c0829d.f8422a.f8601b.l(c0829d.f8424c.f8535j);
        y2.c cVar2 = (i2 & 8) != 0 ? null : cVar;
        Object d3 = c0829d.d();
        x0 x0Var = c0829d.f8422a;
        return J.a(c0829d.f8429h, new C0825b(c0829d, l3, new h0(interfaceC0840m, x0Var, d3, obj, (AbstractC0845s) x0Var.f8600a.l(l3)), c0829d.f8424c.f8536k, cVar2, null), interfaceC1073d);
    }

    public final Object c(Object obj) {
        if (z2.h.a(this.f8432k, this.f8430i) && z2.h.a(this.f8433l, this.f8431j)) {
            return obj;
        }
        x0 x0Var = this.f8422a;
        AbstractC0845s abstractC0845s = (AbstractC0845s) x0Var.f8600a.l(obj);
        int b3 = abstractC0845s.b();
        boolean z3 = false;
        for (int i2 = 0; i2 < b3; i2++) {
            if (abstractC0845s.a(i2) < this.f8432k.a(i2) || abstractC0845s.a(i2) > this.f8433l.a(i2)) {
                abstractC0845s.e(B1.C.B(abstractC0845s.a(i2), this.f8432k.a(i2), this.f8433l.a(i2)), i2);
                z3 = true;
            }
        }
        return z3 ? x0Var.f8601b.l(abstractC0845s) : obj;
    }

    public final Object d() {
        return this.f8424c.f8534i.getValue();
    }

    public final Object e(Object obj, InterfaceC1073d interfaceC1073d) {
        Object a3 = J.a(this.f8429h, new C0827c(this, obj, null), interfaceC1073d);
        return a3 == EnumC1145a.f10026h ? a3 : C0880v.f8657a;
    }

    public /* synthetic */ C0829d(Object obj, x0 x0Var, Object obj2, int i2) {
        this(obj, x0Var, (i2 & 4) != 0 ? null : obj2);
    }
}
