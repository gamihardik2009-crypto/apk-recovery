package F0;

import D0.C;
import D0.E;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, boolean z3, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i7)) != layout.getLineCount() - 1) {
            return;
        }
        C c3 = E.f960a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float x2 = K1.f.x(layout, lineForOffset, paint) + K1.f.w(layout, lineForOffset, paint);
            if (x2 == 0.0f) {
                return;
            }
            z2.h.c(canvas);
            canvas.translate(x2, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z3) {
        return 0;
    }
}
