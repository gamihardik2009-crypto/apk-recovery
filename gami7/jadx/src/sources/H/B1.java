package H;

import J.C0257c;
import J.C0274k0;
import java.time.LocalDate;
import java.util.Locale;

/* loaded from: classes.dex */
public final class B1 {

    /* renamed from: a, reason: collision with root package name */
    public final E2.d f1339a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0180q3 f1340b;

    /* renamed from: c, reason: collision with root package name */
    public final J f1341c;

    /* renamed from: d, reason: collision with root package name */
    public final C0274k0 f1342d;

    /* renamed from: e, reason: collision with root package name */
    public final C0274k0 f1343e;

    /* renamed from: f, reason: collision with root package name */
    public final C0274k0 f1344f;

    public B1(Long l3, Long l4, E2.d dVar, int i2, InterfaceC0180q3 interfaceC0180q3, Locale locale) {
        K d3;
        H h2;
        this.f1339a = dVar;
        this.f1340b = interfaceC0180q3;
        J j3 = new J(locale);
        this.f1341c = j3;
        if (l4 != null) {
            d3 = j3.a(l4.longValue());
            int i3 = d3.f1653a;
            if (!dVar.a(i3)) {
                throw new IllegalArgumentException(("The initial display month's year (" + i3 + ") is out of the years range of " + dVar + '.').toString());
            }
        } else {
            H b3 = j3.b();
            d3 = j3.d(LocalDate.of(b3.f1544h, b3.f1545i, 1));
        }
        this.f1342d = C0257c.N(d3, J.W.f4109m);
        if (l3 != null) {
            h2 = this.f1341c.c(l3.longValue());
            int i4 = h2.f1544h;
            if (!dVar.a(i4)) {
                throw new IllegalArgumentException(("The provided initial date's year (" + i4 + ") is out of the years range of " + dVar + '.').toString());
            }
        } else {
            h2 = null;
        }
        J.W w2 = J.W.f4109m;
        this.f1343e = C0257c.N(h2, w2);
        this.f1344f = C0257c.N(new E1(i2), w2);
    }

    public final int a() {
        return ((E1) this.f1344f.getValue()).f1426a;
    }

    public final Long b() {
        H h2 = (H) this.f1343e.getValue();
        if (h2 != null) {
            return Long.valueOf(h2.f1547k);
        }
        return null;
    }

    public final void c(long j3) {
        K a3 = this.f1341c.a(j3);
        E2.d dVar = this.f1339a;
        int i2 = a3.f1653a;
        if (dVar.a(i2)) {
            this.f1342d.setValue(a3);
            return;
        }
        throw new IllegalArgumentException(("The display month's year (" + i2 + ") is out of the years range of " + dVar + '.').toString());
    }
}
