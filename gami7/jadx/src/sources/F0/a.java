package F0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1084a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1085b;

    public /* synthetic */ a(float f3, int i2) {
        this.f1084a = i2;
        this.f1085b = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f1084a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f1085b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f1085b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f1084a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f1085b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f1085b);
                break;
        }
    }
}
