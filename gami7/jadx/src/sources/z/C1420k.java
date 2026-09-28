package z;

import R0.C0371a;
import m2.C0880v;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1420k extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11719i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D.X f11720j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1420k(D.X x2, int i2) {
        super(1);
        this.f11719i = i2;
        this.f11720j = x2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f11719i) {
            case 0:
                return new C0371a(8, this.f11720j);
            default:
                long j3 = ((b0.c) obj).f7058a;
                this.f11720j.s();
                return C0880v.f8657a;
        }
    }
}
