package F0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f1092a;

    /* renamed from: c, reason: collision with root package name */
    public final int f1094c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1095d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1096e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1097f;

    /* renamed from: k, reason: collision with root package name */
    public int f1102k;

    /* renamed from: l, reason: collision with root package name */
    public int f1103l;

    /* renamed from: b, reason: collision with root package name */
    public final int f1093b = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1098g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f1099h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f1100i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f1101j = Integer.MIN_VALUE;

    public h(float f3, int i2, boolean z3, boolean z4, float f4) {
        this.f1092a = f3;
        this.f1094c = i2;
        this.f1095d = z3;
        this.f1096e = z4;
        this.f1097f = f4;
        if ((0.0f > f4 || f4 > 1.0f) && f4 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        int i6 = fontMetricsInt.descent;
        int i7 = fontMetricsInt.ascent;
        if (i6 - i7 <= 0) {
            return;
        }
        boolean z3 = i2 == this.f1093b;
        boolean z4 = i3 == this.f1094c;
        boolean z5 = this.f1096e;
        boolean z6 = this.f1095d;
        if (z3 && z4 && z6 && z5) {
            return;
        }
        if (this.f1098g == Integer.MIN_VALUE) {
            int i8 = i6 - i7;
            int ceil = (int) Math.ceil(this.f1092a);
            int i9 = ceil - i8;
            float f3 = this.f1097f;
            if (f3 == -1.0f) {
                f3 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f3) : Math.ceil((1.0f - f3) * i9));
            int i10 = fontMetricsInt.descent;
            int i11 = ceil2 + i10;
            this.f1100i = i11;
            int i12 = i11 - ceil;
            this.f1099h = i12;
            if (z6) {
                i12 = fontMetricsInt.ascent;
            }
            this.f1098g = i12;
            if (z5) {
                i11 = i10;
            }
            this.f1101j = i11;
            this.f1102k = fontMetricsInt.ascent - i12;
            this.f1103l = i11 - i10;
        }
        fontMetricsInt.ascent = z3 ? this.f1098g : this.f1099h;
        fontMetricsInt.descent = z4 ? this.f1101j : this.f1100i;
    }
}
