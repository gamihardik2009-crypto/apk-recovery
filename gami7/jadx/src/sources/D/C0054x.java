package D;

import m2.C0880v;
import n0.C0918A;
import n0.C0930i;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1203h;

/* renamed from: D.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054x extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public int f907j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f908k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B.F f909l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0043l f910m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z.a0 f911n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0054x(B.F f3, C0043l c0043l, z.a0 a0Var, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f909l = f3;
        this.f910m = c0043l;
        this.f911n = a0Var;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0054x) m((C0918A) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0054x c0054x = new C0054x(this.f909l, this.f910m, this.f911n, interfaceC1073d);
        c0054x.f908k = obj;
        return c0054x;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C0918A c0918a;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f907j;
        if (i2 == 0) {
            C1.y.J(obj);
            c0918a = (C0918A) this.f908k;
            this.f908k = c0918a;
            this.f907j = 1;
            obj = B1.C.k(c0918a, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
                return C0880v.f8657a;
            }
            c0918a = (C0918A) this.f908k;
            C1.y.J(obj);
        }
        C0930i c0930i = (C0930i) obj;
        if (B1.C.b0(c0930i) && (c0930i.f8944b & 33) != 0) {
            int size = c0930i.f8943a.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!((n0.r) r5.get(i3)).b()) {
                }
            }
            this.f908k = null;
            this.f907j = 2;
            if (B1.C.n(c0918a, this.f909l, this.f910m, c0930i, this) == enumC1145a) {
                return enumC1145a;
            }
            return C0880v.f8657a;
        }
        if (!B1.C.b0(c0930i)) {
            this.f908k = null;
            this.f907j = 3;
            if (B1.C.o(c0918a, this.f911n, c0930i, this) == enumC1145a) {
                return enumC1145a;
            }
        }
        return C0880v.f8657a;
    }
}
