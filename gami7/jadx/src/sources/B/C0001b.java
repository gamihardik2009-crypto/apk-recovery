package B;

import m2.C0880v;

/* renamed from: B.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001b extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C0001b f197j = new C0001b(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0001b f198k = new C0001b(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C0001b f199l = new C0001b(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f200i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0001b(int i2, int i3) {
        super(i2);
        this.f200i = i3;
    }

    @Override // y2.c
    public final /* synthetic */ Object l(Object obj) {
        switch (this.f200i) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i2 = ((I0.l) obj).f3903a;
                break;
        }
        return C0880v.f8657a;
    }
}
