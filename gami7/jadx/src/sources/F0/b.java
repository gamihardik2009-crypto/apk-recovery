package F0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1086a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1087b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f1086a = i2;
        this.f1087b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f1086a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f1087b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f1087b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f1086a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f1087b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f1087b);
                break;
        }
    }
}
