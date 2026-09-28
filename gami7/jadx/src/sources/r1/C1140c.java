package r1;

import J2.B;
import J2.InterfaceC0328z;
import M2.InterfaceC0344h;
import M2.P;
import java.util.concurrent.Callable;
import m2.C0880v;
import n2.AbstractC0960l;
import q2.InterfaceC1073d;
import q2.InterfaceC1076g;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: r1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140c extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9919l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9920m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f9921n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f9922o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0344h f9923p;
    public final /* synthetic */ String[] q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Callable f9924r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140c(boolean z3, r rVar, InterfaceC0344h interfaceC0344h, String[] strArr, Callable callable, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9921n = z3;
        this.f9922o = rVar;
        this.f9923p = interfaceC0344h;
        this.q = strArr;
        this.f9924r = callable;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1140c) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1140c c1140c = new C1140c(this.f9921n, this.f9922o, this.f9923p, this.q, this.f9924r, interfaceC1073d);
        c1140c.f9920m = obj;
        return c1140c;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        InterfaceC1076g l3;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9919l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f9920m;
            L2.g c3 = B2.a.c(-1, 0, 6);
            K1.e eVar = new K1.e(this.q, c3);
            c3.q(c0880v);
            y yVar = (y) interfaceC0328z.r().s(y.f10023j);
            if (yVar == null || (l3 = yVar.f10024h) == null) {
                boolean z3 = this.f9921n;
                r rVar = this.f9922o;
                l3 = z3 ? AbstractC0960l.l(rVar) : AbstractC0960l.k(rVar);
            }
            L2.g c4 = B2.a.c(0, 0, 7);
            B.r(interfaceC0328z, l3, 0, new C1139b(this.f9922o, eVar, c3, this.f9924r, c4, null), 2);
            this.f9919l = 1;
            Object h2 = P.h(this.f9923p, c4, true, this);
            if (h2 != enumC1145a) {
                h2 = c0880v;
            }
            if (h2 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return c0880v;
    }
}
