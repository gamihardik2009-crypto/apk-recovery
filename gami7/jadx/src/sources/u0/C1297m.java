package u0;

import m2.C0880v;

/* renamed from: u0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297m extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C1297m f11108j = new C1297m(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C1297m f11109k = new C1297m(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C1297m f11110l = new C1297m(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C1297m f11111m = new C1297m(1, 3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11112i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1297m(int i2, int i3) {
        super(i2);
        this.f11112i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f11112i) {
            case 0:
                return C0880v.f8657a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(N.o(obj));
        }
    }
}
