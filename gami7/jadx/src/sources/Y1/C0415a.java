package Y1;

import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
import J.C0285q;
import m2.C0880v;

/* renamed from: Y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415a implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public static final C0415a f6274h = new C0415a();

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            AbstractC0088d2.a(B1.C.V(), "Settings", null, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2483a, c0285q, 48, 4);
        }
        return C0880v.f8657a;
    }
}
