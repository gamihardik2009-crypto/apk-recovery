package p;

import m2.C0880v;

/* loaded from: classes.dex */
public final class F extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9412i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M f9413j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(M m3, int i2) {
        super(0);
        this.f9412i = i2;
        this.f9413j = m3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f9412i) {
            case 0:
                L2.k kVar = this.f9413j.f9464A;
                if (kVar != null) {
                    kVar.q(C1040s.f9677a);
                }
                return C0880v.f8657a;
            default:
                return Boolean.valueOf(!this.f9413j.U0());
        }
    }
}
