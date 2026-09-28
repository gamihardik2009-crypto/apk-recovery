package n;

import m2.C0880v;
import t0.C1238G;

/* renamed from: n.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909q extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C0909q f8827j = new C0909q(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0909q f8828k = new C0909q(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C0909q f8829l = new C0909q(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8830i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0909q(int i2, int i3) {
        super(i2);
        this.f8830i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f8830i) {
            case 0:
                ((C1238G) obj).a();
                return C0880v.f8657a;
            case 1:
                ((Number) obj).longValue();
                return C0880v.f8657a;
            default:
                return new w0(((Number) obj).intValue());
        }
    }
}
