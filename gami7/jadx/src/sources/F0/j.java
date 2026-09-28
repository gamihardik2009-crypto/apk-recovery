package F0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f1108a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1109b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1110c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1111d;

    public j(int i2, float f3, float f4, float f5) {
        this.f1108a = i2;
        this.f1109b = f3;
        this.f1110c = f4;
        this.f1111d = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f1111d, this.f1109b, this.f1110c, this.f1108a);
    }
}
