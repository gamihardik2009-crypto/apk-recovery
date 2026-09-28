package D0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f944a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f945b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f947d;

    /* renamed from: e, reason: collision with root package name */
    public E0.f f948e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout f949f;

    /* renamed from: g, reason: collision with root package name */
    public final int f950g;

    /* renamed from: h, reason: collision with root package name */
    public final int f951h;

    /* renamed from: i, reason: collision with root package name */
    public final int f952i;

    /* renamed from: j, reason: collision with root package name */
    public final float f953j;

    /* renamed from: k, reason: collision with root package name */
    public final float f954k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f955l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f956m;

    /* renamed from: n, reason: collision with root package name */
    public final int f957n;

    /* renamed from: o, reason: collision with root package name */
    public final F0.h[] f958o;
    public Q1.e q;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f946c = true;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f959p = new Rect();

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0185, code lost:
    
        if (r12 >= 28) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0180, code lost:
    
        if (r5 == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0272 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D(java.lang.CharSequence r40, float r41, K0.e r42, int r43, android.text.TextUtils.TruncateAt r44, int r45, boolean r46, int r47, int r48, int r49, int r50, int r51, int r52, D0.q r53) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.D.<init>(java.lang.CharSequence, float, K0.e, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, D0.q):void");
    }

    public final int a() {
        boolean z3 = this.f947d;
        Layout layout = this.f949f;
        return (z3 ? layout.getLineBottom(this.f950g - 1) : layout.getHeight()) + this.f951h + this.f952i + this.f957n;
    }

    public final float b(int i2) {
        if (i2 == this.f950g - 1) {
            return this.f953j + this.f954k;
        }
        return 0.0f;
    }

    public final Q1.e c() {
        Q1.e eVar = this.q;
        if (eVar != null) {
            z2.h.c(eVar);
            return eVar;
        }
        Q1.e eVar2 = new Q1.e(this.f949f);
        this.q = eVar2;
        return eVar2;
    }

    public final float d(int i2) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f951h + ((i2 != this.f950g + (-1) || (fontMetricsInt = this.f956m) == null) ? this.f949f.getLineBaseline(i2) : g(i2) - fontMetricsInt.ascent);
    }

    public final float e(int i2) {
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.f950g;
        int i4 = i3 - 1;
        Layout layout = this.f949f;
        if (i2 != i4 || (fontMetricsInt = this.f956m) == null) {
            return this.f951h + layout.getLineBottom(i2) + (i2 == i3 + (-1) ? this.f952i : 0);
        }
        return layout.getLineBottom(i2 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i2) {
        Layout layout = this.f949f;
        return layout.getEllipsisStart(i2) == 0 ? layout.getLineEnd(i2) : layout.getText().length();
    }

    public final float g(int i2) {
        return this.f949f.getLineTop(i2) + (i2 == 0 ? 0 : this.f951h);
    }

    public final float h(int i2, boolean z3) {
        return b(this.f949f.getLineForOffset(i2)) + c().f(i2, true, z3);
    }

    public final float i(int i2, boolean z3) {
        return b(this.f949f.getLineForOffset(i2)) + c().f(i2, false, z3);
    }

    public final E0.f j() {
        E0.f fVar = this.f948e;
        if (fVar != null) {
            return fVar;
        }
        Layout layout = this.f949f;
        E0.f fVar2 = new E0.f(layout.getText(), layout.getText().length(), this.f944a.getTextLocale());
        this.f948e = fVar2;
        return fVar2;
    }
}
