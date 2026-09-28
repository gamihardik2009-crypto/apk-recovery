package D0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f922b;

    /* renamed from: c, reason: collision with root package name */
    public final int f923c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f924d;

    /* renamed from: e, reason: collision with root package name */
    public final int f925e;

    /* renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f926f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f927g;

    /* renamed from: h, reason: collision with root package name */
    public final int f928h;

    /* renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f929i;

    /* renamed from: j, reason: collision with root package name */
    public final int f930j;

    /* renamed from: k, reason: collision with root package name */
    public final float f931k;

    /* renamed from: l, reason: collision with root package name */
    public final float f932l;

    /* renamed from: m, reason: collision with root package name */
    public final int f933m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f934n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f935o;

    /* renamed from: p, reason: collision with root package name */
    public final int f936p;
    public final int q;

    /* renamed from: r, reason: collision with root package name */
    public final int f937r;

    /* renamed from: s, reason: collision with root package name */
    public final int f938s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f939t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f940u;

    public A(CharSequence charSequence, int i2, int i3, TextPaint textPaint, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f3, float f4, int i7, boolean z3, boolean z4, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        this.f921a = charSequence;
        this.f922b = i2;
        this.f923c = i3;
        this.f924d = textPaint;
        this.f925e = i4;
        this.f926f = textDirectionHeuristic;
        this.f927g = alignment;
        this.f928h = i5;
        this.f929i = truncateAt;
        this.f930j = i6;
        this.f931k = f3;
        this.f932l = f4;
        this.f933m = i7;
        this.f934n = z3;
        this.f935o = z4;
        this.f936p = i8;
        this.q = i9;
        this.f937r = i10;
        this.f938s = i11;
        this.f939t = iArr;
        this.f940u = iArr2;
        if (i2 < 0 || i2 > i3) {
            throw new IllegalArgumentException("invalid start value".toString());
        }
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            throw new IllegalArgumentException("invalid end value".toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("invalid maxLines value".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("invalid width value".toString());
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value".toString());
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
        }
    }
}
