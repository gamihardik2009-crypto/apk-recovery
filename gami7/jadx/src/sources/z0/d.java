package z0;

import m2.C0880v;

/* loaded from: classes.dex */
public final class d extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final d f11864j = new d(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f11865k = new d(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f11866l = new d(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11867i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3) {
        super(i2);
        this.f11867i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f11867i) {
            case 0:
                ((Number) obj).longValue();
                return C0880v.f8657a;
            case 1:
                return Integer.valueOf(((k) obj).f11885b);
            default:
                O0.i iVar = ((k) obj).f11886c;
                return Integer.valueOf(iVar.f5146d - iVar.f5144b);
        }
    }
}
