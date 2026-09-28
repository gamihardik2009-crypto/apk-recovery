package d0;

import B1.C;

/* renamed from: d0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645p extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7443i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0646q f7444j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0645p(C0646q c0646q, int i2) {
        super(1);
        this.f7443i = i2;
        this.f7444j = c0646q;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f7443i) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f7444j.f7456n.c(C.A(doubleValue, r10.f7447e, r10.f7448f)));
            default:
                return Double.valueOf(C.A(this.f7444j.f7453k.c(((Number) obj).doubleValue()), r10.f7447e, r10.f7448f));
        }
    }
}
