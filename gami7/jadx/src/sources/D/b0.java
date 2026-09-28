package D;

import m2.C0880v;
import o.C0985k;
import o.C0988n;

/* loaded from: classes.dex */
public final class b0 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f814i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0988n f815j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X f816k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(C0988n c0988n, X x2, int i2) {
        super(0);
        this.f814i = i2;
        this.f815j = c0988n;
        this.f816k = x2;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f814i) {
            case 0:
                this.f816k.f();
                this.f815j.f9216a.setValue(C0985k.f9214a);
                break;
            case 1:
                this.f816k.d(false);
                this.f815j.f9216a.setValue(C0985k.f9214a);
                break;
            case 2:
                this.f816k.n();
                this.f815j.f9216a.setValue(C0985k.f9214a);
                break;
            default:
                this.f816k.o();
                this.f815j.f9216a.setValue(C0985k.f9214a);
                break;
        }
        return C0880v.f8657a;
    }
}
