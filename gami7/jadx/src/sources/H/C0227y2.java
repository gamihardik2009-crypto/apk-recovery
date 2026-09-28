package H;

import c0.C0573M;
import m2.C0880v;

/* renamed from: H.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227y2 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3327i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J.W0 f3328j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0227y2(J.W0 w02, int i2) {
        super(1);
        this.f3327i = i2;
        this.f3328j = w02;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f3327i) {
            case 0:
                ((C0573M) obj).a(((Number) this.f3328j.getValue()).floatValue());
                return C0880v.f8657a;
            case 1:
                return (Float) ((y2.c) this.f3328j.getValue()).l(Float.valueOf(((Number) obj).floatValue()));
            default:
                ((y2.c) this.f3328j.getValue()).l(new b0.c(((b0.c) obj).f7058a));
                return C0880v.f8657a;
        }
    }
}
