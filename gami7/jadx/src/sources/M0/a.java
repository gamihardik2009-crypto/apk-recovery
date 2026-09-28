package M0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import c0.AbstractC0571K;
import e0.AbstractC0655e;
import e0.g;
import z2.h;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0655e f4752a;

    public a(AbstractC0655e abstractC0655e) {
        this.f4752a = abstractC0655e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = g.f7556a;
            AbstractC0655e abstractC0655e = this.f4752a;
            if (h.a(abstractC0655e, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC0655e instanceof e0.h) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((e0.h) abstractC0655e).f7557a);
                textPaint.setStrokeMiter(((e0.h) abstractC0655e).f7558b);
                int i2 = ((e0.h) abstractC0655e).f7560d;
                textPaint.setStrokeJoin(AbstractC0571K.p(i2, 0) ? Paint.Join.MITER : AbstractC0571K.p(i2, 1) ? Paint.Join.ROUND : AbstractC0571K.p(i2, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i3 = ((e0.h) abstractC0655e).f7559c;
                textPaint.setStrokeCap(AbstractC0571K.o(i3, 0) ? Paint.Cap.BUTT : AbstractC0571K.o(i3, 1) ? Paint.Cap.ROUND : AbstractC0571K.o(i3, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                ((e0.h) abstractC0655e).getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
