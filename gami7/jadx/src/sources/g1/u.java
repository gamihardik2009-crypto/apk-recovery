package g1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import h1.C0697a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final t f7763b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f7766e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f7762a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f7764c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f7765d = 1.0f;

    public u(t tVar) {
        l0.c.r(tVar, "rasterizer cannot be null");
        this.f7763b = tVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f3, int i4, int i5, int i6, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i2, i3, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f7766e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f7766e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f3, i4, f3 + this.f7764c, i6, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        C0687i.a().getClass();
        float f4 = i5;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        t tVar = this.f7763b;
        K1.i iVar = tVar.f7760b;
        Typeface typeface = (Typeface) iVar.f4550l;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) iVar.f4548j, tVar.f7759a * 2, 2, f3, f4, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f7762a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        t tVar = this.f7763b;
        this.f7765d = abs / (tVar.c().a(14) != 0 ? ((ByteBuffer) r8.f7787k).getShort(r1 + r8.f7784h) : (short) 0);
        C0697a c3 = tVar.c();
        int a3 = c3.a(14);
        if (a3 != 0) {
            ((ByteBuffer) c3.f7787k).getShort(a3 + c3.f7784h);
        }
        short s3 = (short) ((tVar.c().a(12) != 0 ? ((ByteBuffer) r5.f7787k).getShort(r7 + r5.f7784h) : (short) 0) * this.f7765d);
        this.f7764c = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
