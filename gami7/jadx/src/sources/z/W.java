package z;

import m2.C0880v;

/* loaded from: classes.dex */
public final class W extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11576i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f11577j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(a0 a0Var, int i2) {
        super(0);
        this.f11576i = i2;
        this.f11577j = a0Var;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f11576i) {
            case 0:
                this.f11577j.a();
                break;
            default:
                this.f11577j.onCancel();
                break;
        }
        return C0880v.f8657a;
    }
}
