package D;

import m.C0843p;
import m2.C0880v;

/* loaded from: classes.dex */
public final class F extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final F f726j = new F(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final F f727k = new F(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final F f728l = new F(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f729i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i2, int i3) {
        super(i2);
        this.f729i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f729i) {
            case 0:
                long j3 = ((b0.c) obj).f7058a;
                return K1.f.F(j3) ? new C0843p(b0.c.d(j3), b0.c.e(j3)) : L.f745a;
            case 1:
                C0843p c0843p = (C0843p) obj;
                return new b0.c(K1.f.e(c0843p.f8545a, c0843p.f8546b));
            default:
                return C0880v.f8657a;
        }
    }
}
