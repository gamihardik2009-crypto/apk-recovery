package H;

import c0.C0573M;
import m2.C0880v;

/* loaded from: classes.dex */
public final class C2 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1370i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1371j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1372k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2(int i2, Object obj, boolean z3) {
        super(1);
        this.f1370i = i2;
        this.f1371j = z3;
        this.f1372k = obj;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        boolean z3 = false;
        Object obj2 = this.f1372k;
        C0880v c0880v = C0880v.f8657a;
        boolean z4 = this.f1371j;
        switch (this.f1370i) {
            case 0:
                ((C0573M) obj).a(z4 ? 1.0f : ((Number) ((y2.a) obj2).c()).floatValue());
                break;
            case 1:
                C0573M c0573m = (C0573M) obj;
                if (!z4 && ((Boolean) ((y2.a) obj2).c()).booleanValue()) {
                    z3 = true;
                }
                c0573m.d(z3);
                break;
            default:
                A0.k kVar = (A0.k) obj;
                if (!z4) {
                    F2.d[] dVarArr = A0.w.f123a;
                    kVar.e(A0.t.f103i, c0880v);
                }
                J3 j3 = new J3((P3) obj2, 0);
                F2.d[] dVarArr2 = A0.w.f123a;
                kVar.e(A0.j.f41g, new A0.a(null, j3));
                break;
        }
        return c0880v;
    }
}
