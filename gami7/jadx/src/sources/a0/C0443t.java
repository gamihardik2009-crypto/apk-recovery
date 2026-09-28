package a0;

import m2.C0880v;

/* renamed from: a0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443t extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6495i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0442s f6496j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0443t(C0442s c0442s, int i2) {
        super(0);
        this.f6495i = i2;
        this.f6496j = c0442s;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f6495i) {
            case 0:
                this.f6496j.K0();
                break;
            default:
                C0442s c0442s = this.f6496j;
                if (c0442s.f5858h.f5869t) {
                    AbstractC0427d.A(c0442s);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
