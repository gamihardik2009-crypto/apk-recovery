package D;

import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class W extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f778i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X f779j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(X x2, int i2) {
        super(0);
        this.f778i = i2;
        this.f779j = x2;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f778i) {
            case 0:
                X x2 = this.f779j;
                x2.d(true);
                x2.m();
                break;
            case 1:
                X x3 = this.f779j;
                x3.f();
                x3.m();
                break;
            case 2:
                X x4 = this.f779j;
                x4.n();
                x4.m();
                break;
            case 3:
                this.f779j.o();
                break;
            case 4:
                this.f779j.n();
                break;
            case AbstractC1166e.f10138f /* 5 */:
                this.f779j.h(true);
                break;
            case AbstractC1166e.f10136d /* 6 */:
                this.f779j.d(true);
                break;
            default:
                this.f779j.f();
                break;
        }
        return Boolean.TRUE;
    }
}
