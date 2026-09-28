package D;

import m2.C0880v;
import n0.AbstractC0937p;

/* loaded from: classes.dex */
public final class A extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f711i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z.a0 f712j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(z.a0 a0Var, int i2) {
        super(1);
        this.f711i = i2;
        this.f712j = a0Var;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f711i) {
            case 0:
                n0.r rVar = (n0.r) obj;
                this.f712j.d(AbstractC0937p.h(rVar, false));
                rVar.a();
                break;
            default:
                this.f712j.c(((b0.c) obj).f7058a);
                break;
        }
        return C0880v.f8657a;
    }
}
