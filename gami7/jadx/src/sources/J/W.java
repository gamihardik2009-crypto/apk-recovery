package J;

import N2.AbstractC0364c;
import q2.InterfaceC1077h;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class W implements InterfaceC1077h, L0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ W f4105i = new W(0);

    /* renamed from: j, reason: collision with root package name */
    public static final W f4106j = new W(1);

    /* renamed from: k, reason: collision with root package name */
    public static final W f4107k = new W(2);

    /* renamed from: l, reason: collision with root package name */
    public static final W f4108l = new W(3);

    /* renamed from: m, reason: collision with root package name */
    public static final W f4109m = new W(4);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4110h;

    public /* synthetic */ W(int i2) {
        this.f4110h = i2;
    }

    public static final void b(W w2) {
        M2.d0 d0Var;
        Object obj;
        P.b bVar;
        M2.d0 d0Var2 = C0303z0.f4299v;
        do {
            d0Var = C0303z0.f4299v;
            obj = (M.f) d0Var.getValue();
            bVar = (P.b) obj;
            O.c cVar = bVar.f5224k;
            P.a aVar = (P.a) cVar.get(w2);
            if (aVar != null) {
                int hashCode = w2 != null ? w2.hashCode() : 0;
                O.n nVar = cVar.f5097h;
                O.n v3 = nVar.v(hashCode, 0, w2);
                if (nVar != v3) {
                    cVar = v3 == null ? O.c.f5096j : new O.c(v3, cVar.f5098i - 1);
                }
                Q.b bVar2 = Q.b.f5264a;
                Object obj2 = aVar.f5219a;
                boolean z3 = obj2 != bVar2;
                Object obj3 = aVar.f5220b;
                if (z3) {
                    Object obj4 = cVar.get(obj2);
                    z2.h.c(obj4);
                    cVar = cVar.b(obj2, new P.a(((P.a) obj4).f5219a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = cVar.get(obj3);
                    z2.h.c(obj5);
                    cVar = cVar.b(obj3, new P.a(obj2, ((P.a) obj5).f5220b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.f5222i : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.f5223j;
                }
                bVar = new P.b(obj6, obj2, cVar);
            }
            if (obj == bVar) {
                return;
            }
            Object obj7 = AbstractC0364c.f5033b;
            if (obj == null) {
                obj = obj7;
            }
        } while (!d0Var.l(obj, bVar));
    }

    @Override // J.L0
    public boolean a(Object obj, Object obj2) {
        switch (this.f4110h) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return z2.h.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f4110h) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case AbstractC1166e.f10138f /* 5 */:
                return "Empty";
        }
    }
}
