package R0;

import m2.C0880v;

/* loaded from: classes.dex */
public final class c extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final c f5389j = new c(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f5390k = new c(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f5391l = new c(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f5392m = new c(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f5393n = new c(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f5394o = new c(1, 5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5395i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i2, int i3) {
        super(i2);
        this.f5395i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0880v c0880v = C0880v.f8657a;
        switch (this.f5395i) {
            case 0:
                F2.d[] dVarArr = A0.w.f123a;
                ((A0.k) obj).e(A0.t.f111r, c0880v);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                F2.d[] dVarArr2 = A0.w.f123a;
                ((A0.k) obj).e(A0.t.q, c0880v);
                break;
            case 4:
                break;
            default:
                x xVar = (x) obj;
                if (xVar.isAttachedToWindow()) {
                    xVar.l();
                    break;
                }
                break;
        }
        return c0880v;
    }
}
