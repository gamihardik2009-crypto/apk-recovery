package W1;

import H.D1;
import J.C0285q;
import m2.C0880v;

/* renamed from: W1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387h implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6036h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.a f6037i;

    public /* synthetic */ C0387h(y2.a aVar, int i2) {
        this.f6036h = i2;
        this.f6037i = aVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f6036h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    D1.j(this.f6037i, null, false, null, null, null, null, null, null, T.f5997l, c0285q, 805306368, 510);
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    D1.j(this.f6037i, androidx.compose.foundation.layout.c.f6639a, false, null, null, null, null, null, null, Z1.c.f6414d, c0285q2, 805306416, 508);
                }
                break;
            default:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    D1.j(this.f6037i, null, false, null, null, null, null, null, null, d2.c.f7488g, c0285q3, 805306368, 510);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
