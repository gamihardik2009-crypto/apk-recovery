package C0;

import a.AbstractC0423a;
import android.graphics.RectF;
import android.text.Layout;
import c0.AbstractC0571K;
import c0.C0591j;
import java.text.BreakIterator;
import java.util.ArrayList;
import n2.AbstractC0961m;
import n2.AbstractC0963o;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final G f461a;

    /* renamed from: b, reason: collision with root package name */
    public final o f462b;

    /* renamed from: c, reason: collision with root package name */
    public final long f463c;

    /* renamed from: d, reason: collision with root package name */
    public final float f464d;

    /* renamed from: e, reason: collision with root package name */
    public final float f465e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f466f;

    public H(G g3, o oVar, long j3) {
        this.f461a = g3;
        this.f462b = oVar;
        this.f463c = j3;
        ArrayList arrayList = oVar.f530h;
        float f3 = 0.0f;
        this.f464d = arrayList.isEmpty() ? 0.0f : ((q) arrayList.get(0)).f533a.f485d.d(0);
        ArrayList arrayList2 = oVar.f530h;
        if (!arrayList2.isEmpty()) {
            q qVar = (q) AbstractC0961m.M(arrayList2);
            f3 = qVar.f533a.f485d.d(r3.f950g - 1) + qVar.f538f;
        }
        this.f465e = f3;
        this.f466f = oVar.f529g;
    }

    public final N0.h a(int i2) {
        o oVar = this.f462b;
        oVar.j(i2);
        int length = ((C0024g) oVar.f523a.f5277a).f500a.length();
        ArrayList arrayList = oVar.f530h;
        q qVar = (q) arrayList.get(i2 == length ? AbstractC0963o.u(arrayList) : AbstractC0423a.G(i2, arrayList));
        return qVar.f533a.f485d.f949f.isRtlCharAt(qVar.b(i2)) ? N0.h.f4990i : N0.h.f4989h;
    }

    public final b0.d b(int i2) {
        float i3;
        float i4;
        float h2;
        float h3;
        o oVar = this.f462b;
        oVar.i(i2);
        ArrayList arrayList = oVar.f530h;
        q qVar = (q) arrayList.get(AbstractC0423a.G(i2, arrayList));
        C0019b c0019b = qVar.f533a;
        int b3 = qVar.b(i2);
        CharSequence charSequence = c0019b.f486e;
        if (b3 < 0 || b3 >= charSequence.length()) {
            StringBuilder l3 = B1.t.l("offset(", b3, ") is out of bounds [0,");
            l3.append(charSequence.length());
            l3.append(')');
            throw new IllegalArgumentException(l3.toString().toString());
        }
        D0.D d3 = c0019b.f485d;
        Layout layout = d3.f949f;
        int lineForOffset = layout.getLineForOffset(b3);
        float g3 = d3.g(lineForOffset);
        float e3 = d3.e(lineForOffset);
        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(b3);
        if (!z3 || isRtlCharAt) {
            if (z3 && isRtlCharAt) {
                h2 = d3.i(b3, false);
                h3 = d3.i(b3 + 1, true);
            } else if (isRtlCharAt) {
                h2 = d3.h(b3, false);
                h3 = d3.h(b3 + 1, true);
            } else {
                i3 = d3.i(b3, false);
                i4 = d3.i(b3 + 1, true);
            }
            float f3 = h2;
            i3 = h3;
            i4 = f3;
        } else {
            i3 = d3.h(b3, false);
            i4 = d3.h(b3 + 1, true);
        }
        RectF rectF = new RectF(i3, g3, i4, e3);
        float f4 = rectF.left;
        float f5 = rectF.top;
        float f6 = rectF.right;
        float f7 = rectF.bottom;
        long e4 = K1.f.e(0.0f, qVar.f538f);
        return new b0.d(b0.c.d(e4) + f4, b0.c.e(e4) + f5, b0.c.d(e4) + f6, b0.c.e(e4) + f7);
    }

    public final b0.d c(int i2) {
        o oVar = this.f462b;
        oVar.j(i2);
        int length = ((C0024g) oVar.f523a.f5277a).f500a.length();
        ArrayList arrayList = oVar.f530h;
        q qVar = (q) arrayList.get(i2 == length ? AbstractC0963o.u(arrayList) : AbstractC0423a.G(i2, arrayList));
        C0019b c0019b = qVar.f533a;
        int b3 = qVar.b(i2);
        CharSequence charSequence = c0019b.f486e;
        if (b3 < 0 || b3 > charSequence.length()) {
            StringBuilder l3 = B1.t.l("offset(", b3, ") is out of bounds [0,");
            l3.append(charSequence.length());
            l3.append(']');
            throw new IllegalArgumentException(l3.toString().toString());
        }
        D0.D d3 = c0019b.f485d;
        float h2 = d3.h(b3, false);
        int lineForOffset = d3.f949f.getLineForOffset(b3);
        float g3 = d3.g(lineForOffset);
        float e3 = d3.e(lineForOffset);
        long e4 = K1.f.e(0.0f, qVar.f538f);
        return new b0.d(b0.c.d(e4) + h2, b0.c.e(e4) + g3, b0.c.d(e4) + h2, b0.c.e(e4) + e3);
    }

    public final int d(int i2, boolean z3) {
        int f3;
        o oVar = this.f462b;
        oVar.k(i2);
        ArrayList arrayList = oVar.f530h;
        q qVar = (q) arrayList.get(AbstractC0423a.H(i2, arrayList));
        C0019b c0019b = qVar.f533a;
        int i3 = i2 - qVar.f536d;
        D0.D d3 = c0019b.f485d;
        if (z3) {
            Layout layout = d3.f949f;
            if (layout.getEllipsisStart(i3) == 0) {
                Q1.e c3 = d3.c();
                Layout layout2 = (Layout) c3.f5277a;
                f3 = c3.i(layout2.getLineEnd(i3), layout2.getLineStart(i3));
            } else {
                f3 = layout.getEllipsisStart(i3) + layout.getLineStart(i3);
            }
        } else {
            f3 = d3.f(i3);
        }
        return f3 + qVar.f534b;
    }

    public final int e(int i2) {
        o oVar = this.f462b;
        int length = ((C0024g) oVar.f523a.f5277a).f500a.length();
        ArrayList arrayList = oVar.f530h;
        q qVar = (q) arrayList.get(i2 >= length ? AbstractC0963o.u(arrayList) : i2 < 0 ? 0 : AbstractC0423a.G(i2, arrayList));
        return qVar.f533a.f485d.f949f.getLineForOffset(qVar.b(i2)) + qVar.f536d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h2 = (H) obj;
        return z2.h.a(this.f461a, h2.f461a) && z2.h.a(this.f462b, h2.f462b) && O0.j.a(this.f463c, h2.f463c) && this.f464d == h2.f464d && this.f465e == h2.f465e && z2.h.a(this.f466f, h2.f466f);
    }

    public final float f(int i2) {
        o oVar = this.f462b;
        oVar.k(i2);
        ArrayList arrayList = oVar.f530h;
        q qVar = (q) arrayList.get(AbstractC0423a.H(i2, arrayList));
        C0019b c0019b = qVar.f533a;
        int i3 = i2 - qVar.f536d;
        D0.D d3 = c0019b.f485d;
        return d3.f949f.getLineLeft(i3) + (i3 == d3.f950g + (-1) ? d3.f953j : 0.0f);
    }

    public final float g(int i2) {
        o oVar = this.f462b;
        oVar.k(i2);
        ArrayList arrayList = oVar.f530h;
        q qVar = (q) arrayList.get(AbstractC0423a.H(i2, arrayList));
        C0019b c0019b = qVar.f533a;
        int i3 = i2 - qVar.f536d;
        D0.D d3 = c0019b.f485d;
        return d3.f949f.getLineRight(i3) + (i3 == d3.f950g + (-1) ? d3.f954k : 0.0f);
    }

    public final int h(int i2) {
        o oVar = this.f462b;
        oVar.k(i2);
        ArrayList arrayList = oVar.f530h;
        q qVar = (q) arrayList.get(AbstractC0423a.H(i2, arrayList));
        C0019b c0019b = qVar.f533a;
        return c0019b.f485d.f949f.getLineStart(i2 - qVar.f536d) + qVar.f534b;
    }

    public final int hashCode() {
        return this.f466f.hashCode() + B1.t.c(this.f465e, B1.t.c(this.f464d, B1.t.d((this.f462b.hashCode() + (this.f461a.hashCode() * 31)) * 31, 31, this.f463c), 31), 31);
    }

    public final N0.h i(int i2) {
        o oVar = this.f462b;
        oVar.j(i2);
        int length = ((C0024g) oVar.f523a.f5277a).f500a.length();
        ArrayList arrayList = oVar.f530h;
        q qVar = (q) arrayList.get(i2 == length ? AbstractC0963o.u(arrayList) : AbstractC0423a.G(i2, arrayList));
        C0019b c0019b = qVar.f533a;
        int b3 = qVar.b(i2);
        D0.D d3 = c0019b.f485d;
        return d3.f949f.getParagraphDirection(d3.f949f.getLineForOffset(b3)) == 1 ? N0.h.f4989h : N0.h.f4990i;
    }

    public final C0591j j(int i2, int i3) {
        o oVar = this.f462b;
        Q1.e eVar = oVar.f523a;
        if (i2 >= 0 && i2 <= i3 && i3 <= ((C0024g) eVar.f5277a).f500a.length()) {
            if (i2 == i3) {
                return AbstractC0571K.h();
            }
            C0591j h2 = AbstractC0571K.h();
            AbstractC0423a.J(oVar.f530h, B1.C.j(i2, i3), new A.c(h2, i2, i3, 4));
            return h2;
        }
        throw new IllegalArgumentException(("Start(" + i2 + ") or End(" + i3 + ") is out of range [0.." + ((C0024g) eVar.f5277a).f500a.length() + "), or start > end!").toString());
    }

    public final long k(int i2) {
        int preceding;
        int i3;
        int following;
        o oVar = this.f462b;
        oVar.j(i2);
        int length = ((C0024g) oVar.f523a.f5277a).f500a.length();
        ArrayList arrayList = oVar.f530h;
        q qVar = (q) arrayList.get(i2 == length ? AbstractC0963o.u(arrayList) : AbstractC0423a.G(i2, arrayList));
        C0019b c0019b = qVar.f533a;
        int b3 = qVar.b(i2);
        E0.f j3 = c0019b.f485d.j();
        j3.a(b3);
        BreakIterator breakIterator = (BreakIterator) j3.f1024e;
        if (j3.f(breakIterator.preceding(b3))) {
            j3.a(b3);
            preceding = b3;
            while (preceding != -1 && (!j3.f(preceding) || j3.d(preceding))) {
                j3.a(preceding);
                preceding = breakIterator.preceding(preceding);
            }
        } else {
            j3.a(b3);
            preceding = j3.e(b3) ? (!breakIterator.isBoundary(b3) || j3.c(b3)) ? breakIterator.preceding(b3) : b3 : j3.c(b3) ? breakIterator.preceding(b3) : -1;
        }
        if (preceding == -1) {
            preceding = b3;
        }
        j3.a(b3);
        if (j3.d(breakIterator.following(b3))) {
            j3.a(b3);
            i3 = b3;
            while (i3 != -1 && (j3.f(i3) || !j3.d(i3))) {
                j3.a(i3);
                i3 = breakIterator.following(i3);
            }
        } else {
            j3.a(b3);
            if (j3.c(b3)) {
                following = (!breakIterator.isBoundary(b3) || j3.e(b3)) ? breakIterator.following(b3) : b3;
            } else if (j3.e(b3)) {
                following = breakIterator.following(b3);
            } else {
                i3 = -1;
            }
            i3 = following;
        }
        if (i3 != -1) {
            b3 = i3;
        }
        return qVar.a(B1.C.j(preceding, b3), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f461a + ", multiParagraph=" + this.f462b + ", size=" + ((Object) O0.j.d(this.f463c)) + ", firstBaseline=" + this.f464d + ", lastBaseline=" + this.f465e + ", placeholderRects=" + this.f466f + ')';
    }
}
