package B;

import C0.C0024g;
import D.X;
import I0.C0244a;
import I0.C0250g;
import I0.InterfaceC0252i;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import c0.AbstractC0571K;
import java.util.regex.Matcher;
import r0.InterfaceC1129r;
import u0.V0;
import z.EnumC1407G;
import z.S;
import z.p0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f235a = new w();

    private final void C(K k3, SelectGesture selectGesture, J j3) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        AbstractC0571K.C(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void D(S s3, SelectGesture selectGesture, X x2) {
        RectF selectionArea;
        int granularity;
        if (x2 != null) {
            selectionArea = selectGesture.getSelectionArea();
            b0.d C3 = AbstractC0571K.C(selectionArea);
            granularity = selectGesture.getGranularity();
            long A3 = C1.y.A(s3, C3, G(granularity));
            S s4 = x2.f783d;
            if (s4 != null) {
                s4.g(A3);
            }
            S s5 = x2.f783d;
            if (s5 != null) {
                s5.f(C0.J.f471b);
            }
            if (C0.J.b(A3)) {
                return;
            }
            x2.t(false);
            x2.r(EnumC1407G.f11511h);
        }
    }

    private final void E(K k3, SelectRangeGesture selectRangeGesture, J j3) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        AbstractC0571K.C(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        AbstractC0571K.C(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void F(S s3, SelectRangeGesture selectRangeGesture, X x2) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        if (x2 != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            b0.d C3 = AbstractC0571K.C(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            b0.d C4 = AbstractC0571K.C(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            long h2 = C1.y.h(s3, C3, C4, G(granularity));
            S s4 = x2.f783d;
            if (s4 != null) {
                s4.g(h2);
            }
            S s5 = x2.f783d;
            if (s5 != null) {
                s5.f(C0.J.f471b);
            }
            if (C0.J.b(h2)) {
                return;
            }
            x2.t(false);
            x2.r(EnumC1407G.f11511h);
        }
    }

    private final int G(int i2) {
        return i2 != 1 ? 0 : 1;
    }

    private final int a(K k3, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture, y2.c cVar) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cVar.l(new C0244a(fallbackText, 1));
        return 5;
    }

    private final int c(K k3, DeleteGesture deleteGesture, J j3) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        AbstractC0571K.C(deletionArea);
        throw null;
    }

    private final int d(S s3, DeleteGesture deleteGesture, C0024g c0024g, y2.c cVar) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        int G3 = G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        long A3 = C1.y.A(s3, AbstractC0571K.C(deletionArea), G3);
        if (C0.J.b(A3)) {
            return f235a.b(t.i(deleteGesture), cVar);
        }
        h(A3, c0024g, G3 == 1, cVar);
        return 1;
    }

    private final int e(K k3, DeleteRangeGesture deleteRangeGesture, J j3) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        AbstractC0571K.C(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        AbstractC0571K.C(deletionEndArea);
        throw null;
    }

    private final int f(S s3, DeleteRangeGesture deleteRangeGesture, C0024g c0024g, y2.c cVar) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        int G3 = G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        b0.d C3 = AbstractC0571K.C(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long h2 = C1.y.h(s3, C3, AbstractC0571K.C(deletionEndArea), G3);
        if (C0.J.b(h2)) {
            return f235a.b(t.i(deleteRangeGesture), cVar);
        }
        h(h2, c0024g, G3 == 1, cVar);
        return 1;
    }

    private final void g(K k3, long j3, boolean z3) {
        if (!z3) {
            throw null;
        }
        throw null;
    }

    private final void h(long j3, C0024g c0024g, boolean z3, y2.c cVar) {
        if (z3) {
            int i2 = C0.J.f472c;
            int i3 = (int) (j3 >> 32);
            int i4 = (int) (j3 & 4294967295L);
            int codePointBefore = i3 > 0 ? Character.codePointBefore(c0024g, i3) : 10;
            int codePointAt = i4 < c0024g.length() ? Character.codePointAt(c0024g, i4) : 10;
            if (C1.y.F(codePointBefore) && (C1.y.E(codePointAt) || C1.y.D(codePointAt))) {
                do {
                    i3 -= Character.charCount(codePointBefore);
                    if (i3 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(c0024g, i3);
                    }
                } while (C1.y.F(codePointBefore));
                j3 = B1.C.j(i3, i4);
            } else if (C1.y.F(codePointAt) && (C1.y.E(codePointBefore) || C1.y.D(codePointBefore))) {
                do {
                    i4 += Character.charCount(codePointAt);
                    if (i4 == c0024g.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(c0024g, i4);
                    }
                } while (C1.y.F(codePointAt));
                j3 = B1.C.j(i3, i4);
            }
        }
        int i5 = (int) (4294967295L & j3);
        cVar.l(new x(new InterfaceC0252i[]{new I0.x(i5, i5), new C0250g(C0.J.c(j3), 0)}));
    }

    private final int k(K k3, InsertGesture insertGesture, J j3, V0 v0) {
        PointF insertionPoint;
        insertionPoint = insertGesture.getInsertionPoint();
        K1.f.e(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final int l(S s3, InsertGesture insertGesture, V0 v0, y2.c cVar) {
        PointF insertionPoint;
        p0 d3;
        String textToInsert;
        C0.H h2;
        C0.H h3;
        C0.o oVar;
        InterfaceC1129r c3;
        long m3;
        int x2;
        if (v0 == null) {
            return b(t.i(insertGesture), cVar);
        }
        insertionPoint = insertGesture.getInsertionPoint();
        long e3 = K1.f.e(insertionPoint.x, insertionPoint.y);
        p0 d4 = s3.d();
        int e4 = (d4 == null || (h3 = d4.f11788a) == null || (oVar = h3.f462b) == null || (c3 = s3.c()) == null || (x2 = C1.y.x(oVar, (m3 = c3.m(e3)), v0)) == -1) ? -1 : oVar.e(b0.c.a(m3, (oVar.b(x2) + oVar.d(x2)) / 2.0f, 1));
        if (e4 == -1 || !((d3 = s3.d()) == null || (h2 = d3.f11788a) == null || !C1.y.i(h2, e4))) {
            return b(t.i(insertGesture), cVar);
        }
        textToInsert = insertGesture.getTextToInsert();
        m(e4, textToInsert, cVar);
        return 1;
    }

    private final void m(int i2, String str, y2.c cVar) {
        cVar.l(new x(new InterfaceC0252i[]{new I0.x(i2, i2), new C0244a(str, 1)}));
    }

    private final int n(K k3, JoinOrSplitGesture joinOrSplitGesture, J j3, V0 v0) {
        throw null;
    }

    private final int o(S s3, JoinOrSplitGesture joinOrSplitGesture, C0024g c0024g, V0 v0, y2.c cVar) {
        PointF joinOrSplitPoint;
        p0 d3;
        C0.H h2;
        C0.H h3;
        C0.o oVar;
        InterfaceC1129r c3;
        long m3;
        int x2;
        if (v0 == null) {
            return b(t.i(joinOrSplitGesture), cVar);
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long e3 = K1.f.e(joinOrSplitPoint.x, joinOrSplitPoint.y);
        p0 d4 = s3.d();
        int e4 = (d4 == null || (h3 = d4.f11788a) == null || (oVar = h3.f462b) == null || (c3 = s3.c()) == null || (x2 = C1.y.x(oVar, (m3 = c3.m(e3)), v0)) == -1) ? -1 : oVar.e(b0.c.a(m3, (oVar.b(x2) + oVar.d(x2)) / 2.0f, 1));
        if (e4 == -1 || !((d3 = s3.d()) == null || (h2 = d3.f11788a) == null || !C1.y.i(h2, e4))) {
            return b(t.i(joinOrSplitGesture), cVar);
        }
        int i2 = e4;
        while (i2 > 0) {
            int codePointBefore = Character.codePointBefore(c0024g, i2);
            if (!C1.y.E(codePointBefore)) {
                break;
            }
            i2 -= Character.charCount(codePointBefore);
        }
        while (e4 < c0024g.length()) {
            int codePointAt = Character.codePointAt(c0024g, e4);
            if (!C1.y.E(codePointAt)) {
                break;
            }
            e4 += Character.charCount(codePointAt);
        }
        long j3 = B1.C.j(i2, e4);
        if (C0.J.b(j3)) {
            m((int) (j3 >> 32), " ", cVar);
        } else {
            h(j3, c0024g, false, cVar);
        }
        return 1;
    }

    private final int p(K k3, RemoveSpaceGesture removeSpaceGesture, J j3, V0 v0) {
        throw null;
    }

    private final int q(S s3, RemoveSpaceGesture removeSpaceGesture, C0024g c0024g, V0 v0, y2.c cVar) {
        PointF startPoint;
        PointF endPoint;
        long j3;
        int i2;
        int i3;
        int i4;
        String sb;
        p0 d3 = s3.d();
        C0.H h2 = d3 != null ? d3.f11788a : null;
        startPoint = removeSpaceGesture.getStartPoint();
        long e3 = K1.f.e(startPoint.x, startPoint.y);
        endPoint = removeSpaceGesture.getEndPoint();
        long e4 = K1.f.e(endPoint.x, endPoint.y);
        InterfaceC1129r c3 = s3.c();
        if (h2 == null || c3 == null) {
            j3 = C0.J.f471b;
        } else {
            long m3 = c3.m(e3);
            long m4 = c3.m(e4);
            C0.o oVar = h2.f462b;
            int x2 = C1.y.x(oVar, m3, v0);
            int x3 = C1.y.x(oVar, m4, v0);
            if (x2 != -1) {
                if (x3 != -1) {
                    x2 = Math.min(x2, x3);
                }
                x3 = x2;
            } else if (x3 == -1) {
                j3 = C0.J.f471b;
            }
            float b3 = (oVar.b(x3) + oVar.d(x3)) / 2;
            j3 = oVar.f(new b0.d(Math.min(b0.c.d(m3), b0.c.d(m4)), b3 - 0.1f, Math.max(b0.c.d(m3), b0.c.d(m4)), b3 + 0.1f), 0, C0.F.f449a);
        }
        if (C0.J.b(j3)) {
            return f235a.b(t.i(removeSpaceGesture), cVar);
        }
        String obj = c0024g.subSequence(C0.J.e(j3), C0.J.d(j3)).toString();
        H2.e eVar = new H2.e("\\s+");
        z2.h.f(obj, "input");
        K1.m a3 = H2.e.a(eVar, obj);
        if (a3 == null) {
            sb = obj.toString();
            i3 = -1;
            i2 = -1;
        } else {
            int length = obj.length();
            StringBuilder sb2 = new StringBuilder(length);
            int i5 = 0;
            i2 = -1;
            while (true) {
                sb2.append((CharSequence) obj, i5, a3.i().f1076h);
                if (i2 == -1) {
                    i2 = a3.i().f1076h;
                }
                i3 = a3.i().f1077i + 1;
                sb2.append((CharSequence) "");
                i4 = a3.i().f1077i + 1;
                Matcher matcher = (Matcher) a3.f4558a;
                int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
                CharSequence charSequence = (CharSequence) a3.f4559b;
                if (end <= charSequence.length()) {
                    Matcher matcher2 = matcher.pattern().matcher(charSequence);
                    z2.h.e(matcher2, "matcher(...)");
                    a3 = !matcher2.find(end) ? null : new K1.m(matcher2, charSequence);
                } else {
                    a3 = null;
                }
                if (i4 >= length || a3 == null) {
                    break;
                }
                i5 = i4;
            }
            if (i4 < length) {
                sb2.append((CharSequence) obj, i4, length);
            }
            sb = sb2.toString();
            z2.h.e(sb, "toString(...)");
        }
        if (i2 == -1 || i3 == -1) {
            return b(t.i(removeSpaceGesture), cVar);
        }
        int i6 = (int) (j3 >> 32);
        String substring = sb.substring(i2, sb.length() - (C0.J.c(j3) - i3));
        z2.h.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        cVar.l(new x(new InterfaceC0252i[]{new I0.x(i6 + i2, i6 + i3), new C0244a(substring, 1)}));
        return 1;
    }

    private final int r(K k3, SelectGesture selectGesture, J j3) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        AbstractC0571K.C(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int s(S s3, SelectGesture selectGesture, X x2, y2.c cVar) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        b0.d C3 = AbstractC0571K.C(selectionArea);
        granularity = selectGesture.getGranularity();
        long A3 = C1.y.A(s3, C3, G(granularity));
        if (C0.J.b(A3)) {
            return f235a.b(t.i(selectGesture), cVar);
        }
        v(A3, x2, cVar);
        return 1;
    }

    private final int t(K k3, SelectRangeGesture selectRangeGesture, J j3) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        AbstractC0571K.C(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        AbstractC0571K.C(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int u(S s3, SelectRangeGesture selectRangeGesture, X x2, y2.c cVar) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        b0.d C3 = AbstractC0571K.C(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        b0.d C4 = AbstractC0571K.C(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long h2 = C1.y.h(s3, C3, C4, G(granularity));
        if (C0.J.b(h2)) {
            return f235a.b(t.i(selectRangeGesture), cVar);
        }
        v(h2, x2, cVar);
        return 1;
    }

    private final void v(long j3, X x2, y2.c cVar) {
        int i2 = C0.J.f472c;
        cVar.l(new I0.x((int) (j3 >> 32), (int) (j3 & 4294967295L)));
        if (x2 != null) {
            x2.h(true);
        }
    }

    private final void w(K k3, DeleteGesture deleteGesture, J j3) {
        RectF deletionArea;
        int granularity;
        deletionArea = deleteGesture.getDeletionArea();
        AbstractC0571K.C(deletionArea);
        granularity = deleteGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void x(S s3, DeleteGesture deleteGesture, X x2) {
        RectF deletionArea;
        int granularity;
        if (x2 != null) {
            deletionArea = deleteGesture.getDeletionArea();
            b0.d C3 = AbstractC0571K.C(deletionArea);
            granularity = deleteGesture.getGranularity();
            long A3 = C1.y.A(s3, C3, G(granularity));
            S s4 = x2.f783d;
            if (s4 != null) {
                s4.f(A3);
            }
            S s5 = x2.f783d;
            if (s5 != null) {
                s5.g(C0.J.f471b);
            }
            if (C0.J.b(A3)) {
                return;
            }
            x2.t(false);
            x2.r(EnumC1407G.f11511h);
        }
    }

    private final void y(K k3, DeleteRangeGesture deleteRangeGesture, J j3) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        AbstractC0571K.C(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        AbstractC0571K.C(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void z(S s3, DeleteRangeGesture deleteRangeGesture, X x2) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        if (x2 != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            b0.d C3 = AbstractC0571K.C(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            b0.d C4 = AbstractC0571K.C(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            long h2 = C1.y.h(s3, C3, C4, G(granularity));
            S s4 = x2.f783d;
            if (s4 != null) {
                s4.f(h2);
            }
            S s5 = x2.f783d;
            if (s5 != null) {
                s5.g(C0.J.f471b);
            }
            if (C0.J.b(h2)) {
                return;
            }
            x2.t(false);
            x2.r(EnumC1407G.f11511h);
        }
    }

    public final boolean A(K k3, PreviewableHandwritingGesture previewableHandwritingGesture, J j3, CancellationSignal cancellationSignal) {
        if (t.o(previewableHandwritingGesture)) {
            C(k3, t.j(previewableHandwritingGesture), j3);
        } else if (n.r(previewableHandwritingGesture)) {
            w(k3, n.g(previewableHandwritingGesture), j3);
        } else if (n.u(previewableHandwritingGesture)) {
            E(k3, n.l(previewableHandwritingGesture), j3);
        } else {
            if (!n.w(previewableHandwritingGesture)) {
                return false;
            }
            y(k3, n.h(previewableHandwritingGesture), j3);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new v());
        return true;
    }

    public final boolean B(S s3, PreviewableHandwritingGesture previewableHandwritingGesture, X x2, CancellationSignal cancellationSignal) {
        C0.H h2;
        C0.G g3;
        C0024g c0024g = s3.f11552j;
        if (c0024g == null) {
            return false;
        }
        p0 d3 = s3.d();
        if (!z2.h.a(c0024g, (d3 == null || (h2 = d3.f11788a) == null || (g3 = h2.f461a) == null) ? null : g3.f451a)) {
            return false;
        }
        if (t.o(previewableHandwritingGesture)) {
            D(s3, t.j(previewableHandwritingGesture), x2);
        } else if (n.r(previewableHandwritingGesture)) {
            x(s3, n.g(previewableHandwritingGesture), x2);
        } else if (n.u(previewableHandwritingGesture)) {
            F(s3, n.l(previewableHandwritingGesture), x2);
        } else {
            if (!n.w(previewableHandwritingGesture)) {
                return false;
            }
            z(s3, n.h(previewableHandwritingGesture), x2);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new u(0, x2));
        return true;
    }

    public final int i(K k3, HandwritingGesture handwritingGesture, J j3, V0 v0) {
        if (t.o(handwritingGesture)) {
            return r(k3, t.j(handwritingGesture), j3);
        }
        if (n.r(handwritingGesture)) {
            return c(k3, n.g(handwritingGesture), j3);
        }
        if (n.u(handwritingGesture)) {
            return t(k3, n.l(handwritingGesture), j3);
        }
        if (n.w(handwritingGesture)) {
            return e(k3, n.h(handwritingGesture), j3);
        }
        if (n.C(handwritingGesture)) {
            return n(k3, n.j(handwritingGesture), j3, v0);
        }
        if (n.y(handwritingGesture)) {
            return k(k3, n.i(handwritingGesture), j3, v0);
        }
        if (n.A(handwritingGesture)) {
            return p(k3, n.k(handwritingGesture), j3, v0);
        }
        return 2;
    }

    public final int j(S s3, HandwritingGesture handwritingGesture, X x2, V0 v0, y2.c cVar) {
        C0.H h2;
        C0.G g3;
        C0024g c0024g = s3.f11552j;
        if (c0024g == null) {
            return 3;
        }
        p0 d3 = s3.d();
        if (!z2.h.a(c0024g, (d3 == null || (h2 = d3.f11788a) == null || (g3 = h2.f461a) == null) ? null : g3.f451a)) {
            return 3;
        }
        if (t.o(handwritingGesture)) {
            return s(s3, t.j(handwritingGesture), x2, cVar);
        }
        if (n.r(handwritingGesture)) {
            return d(s3, n.g(handwritingGesture), c0024g, cVar);
        }
        if (n.u(handwritingGesture)) {
            return u(s3, n.l(handwritingGesture), x2, cVar);
        }
        if (n.w(handwritingGesture)) {
            return f(s3, n.h(handwritingGesture), c0024g, cVar);
        }
        if (n.C(handwritingGesture)) {
            return o(s3, n.j(handwritingGesture), c0024g, v0, cVar);
        }
        if (n.y(handwritingGesture)) {
            return l(s3, n.i(handwritingGesture), v0, cVar);
        }
        if (n.A(handwritingGesture)) {
            return q(s3, n.k(handwritingGesture), c0024g, v0, cVar);
        }
        return 2;
    }
}
