package E0;

import a.AbstractC0423a;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends AbstractC0423a {

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1017g;

    /* renamed from: h, reason: collision with root package name */
    public final TextPaint f1018h;

    public c(CharSequence charSequence, TextPaint textPaint) {
        this.f1017g = charSequence;
        this.f1018h = textPaint;
    }

    @Override // a.AbstractC0423a
    public final int T(int i2) {
        int textRunCursor;
        CharSequence charSequence = this.f1017g;
        textRunCursor = this.f1018h.getTextRunCursor(charSequence, 0, charSequence.length(), false, i2, 0);
        return textRunCursor;
    }

    @Override // a.AbstractC0423a
    public final int U(int i2) {
        int textRunCursor;
        CharSequence charSequence = this.f1017g;
        textRunCursor = this.f1018h.getTextRunCursor(charSequence, 0, charSequence.length(), false, i2, 2);
        return textRunCursor;
    }
}
