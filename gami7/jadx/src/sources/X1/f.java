package X1;

import H.O5;
import H.P5;
import H.t5;
import H0.k;
import J.C0285q;
import V.l;
import m2.C0880v;

/* loaded from: classes.dex */
public final class f implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f6227h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6228i;

    public f(String str, long j3) {
        this.f6227h = str;
        this.f6228i = j3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            t5.b(this.f6227h, androidx.compose.foundation.layout.a.j(l.f5857b, 12, 4), this.f6228i, 0L, null, k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(P5.f1917a)).f1867n, c0285q, 196656, 0, 65496);
        }
        return C0880v.f8657a;
    }
}
