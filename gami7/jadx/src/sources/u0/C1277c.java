package u0;

import java.text.BreakIterator;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1277c extends AbstractC1275b {

    /* renamed from: e, reason: collision with root package name */
    public static C1277c f11031e;

    /* renamed from: f, reason: collision with root package name */
    public static C1277c f11032f;

    /* renamed from: g, reason: collision with root package name */
    public static C1277c f11033g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11034c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11035d;

    public /* synthetic */ C1277c(int i2) {
        this.f11034c = i2;
    }

    @Override // u0.AbstractC1275b
    public final int[] a(int i2) {
        int i3;
        switch (this.f11034c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f11035d;
                    if (breakIterator == null) {
                        z2.h.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i2)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f11035d;
                        if (breakIterator2 == null) {
                            z2.h.j("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i2);
                        if (following == -1) {
                            return null;
                        }
                        return b(i2, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f11035d;
                    if (breakIterator3 == null) {
                        z2.h.j("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!h(i2) && (!h(i2) || (i2 != 0 && h(i2 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f11035d;
                    if (breakIterator4 == null) {
                        z2.h.j("impl");
                        throw null;
                    }
                    i2 = breakIterator4.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f11035d;
                if (breakIterator5 == null) {
                    z2.h.j("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i2);
                if (following2 == -1 || !g(following2)) {
                    return null;
                }
                return b(i2, following2);
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                N0.h hVar = N0.h.f4990i;
                if (i2 < 0) {
                    C0.H h2 = (C0.H) this.f11035d;
                    if (h2 == null) {
                        z2.h.j("layoutResult");
                        throw null;
                    }
                    i3 = h2.e(0);
                } else {
                    C0.H h3 = (C0.H) this.f11035d;
                    if (h3 == null) {
                        z2.h.j("layoutResult");
                        throw null;
                    }
                    int e3 = h3.e(i2);
                    i3 = e(e3, hVar) == i2 ? e3 : e3 + 1;
                }
                C0.H h4 = (C0.H) this.f11035d;
                if (h4 == null) {
                    z2.h.j("layoutResult");
                    throw null;
                }
                if (i3 >= h4.f462b.f528f) {
                    return null;
                }
                return b(e(i3, hVar), e(i3, N0.h.f4989h) + 1);
        }
    }

    @Override // u0.AbstractC1275b
    public final int[] d(int i2) {
        int i3;
        switch (this.f11034c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f11035d;
                    if (breakIterator == null) {
                        z2.h.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i2)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f11035d;
                        if (breakIterator2 == null) {
                            z2.h.j("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i2);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i2);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f11035d;
                    if (breakIterator3 == null) {
                        z2.h.j("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !h(i2 - 1) && !g(i2)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f11035d;
                    if (breakIterator4 == null) {
                        z2.h.j("impl");
                        throw null;
                    }
                    i2 = breakIterator4.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f11035d;
                if (breakIterator5 == null) {
                    z2.h.j("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i2);
                if (preceding2 == -1 || !h(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !h(preceding2 - 1)) {
                    return b(preceding2, i2);
                }
                return null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                N0.h hVar = N0.h.f4989h;
                if (i2 > length3) {
                    C0.H h2 = (C0.H) this.f11035d;
                    if (h2 == null) {
                        z2.h.j("layoutResult");
                        throw null;
                    }
                    i3 = h2.e(c().length());
                } else {
                    C0.H h3 = (C0.H) this.f11035d;
                    if (h3 == null) {
                        z2.h.j("layoutResult");
                        throw null;
                    }
                    int e3 = h3.e(i2);
                    i3 = e(e3, hVar) + 1 == i2 ? e3 : e3 - 1;
                }
                if (i3 < 0) {
                    return null;
                }
                return b(e(i3, N0.h.f4990i), e(i3, hVar) + 1);
        }
    }

    public int e(int i2, N0.h hVar) {
        C0.H h2 = (C0.H) this.f11035d;
        if (h2 == null) {
            z2.h.j("layoutResult");
            throw null;
        }
        int h3 = h2.h(i2);
        C0.H h4 = (C0.H) this.f11035d;
        if (h4 == null) {
            z2.h.j("layoutResult");
            throw null;
        }
        if (hVar != h4.i(h3)) {
            C0.H h5 = (C0.H) this.f11035d;
            if (h5 != null) {
                return h5.h(i2);
            }
            z2.h.j("layoutResult");
            throw null;
        }
        if (((C0.H) this.f11035d) != null) {
            return r6.d(i2, false) - 1;
        }
        z2.h.j("layoutResult");
        throw null;
    }

    public void f(String str) {
        switch (this.f11034c) {
            case 0:
                this.f11028a = str;
                BreakIterator breakIterator = (BreakIterator) this.f11035d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    z2.h.j("impl");
                    throw null;
                }
            default:
                this.f11028a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f11035d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    z2.h.j("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i2) {
        return i2 > 0 && h(i2 + (-1)) && (i2 == c().length() || !h(i2));
    }

    public boolean h(int i2) {
        if (i2 < 0 || i2 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i2));
    }
}
