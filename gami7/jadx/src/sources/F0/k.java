package F0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1112a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1113b;

    public k(boolean z3, boolean z4) {
        this.f1112a = z3;
        this.f1113b = z4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f1112a);
        textPaint.setStrikeThruText(this.f1113b);
    }
}
