package D0;

import C0.C0018a;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final t f988a = new t();

    public static final Rect a(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int nextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        s.a(textPaint2, charSequence, i4, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            s.a(textPaint, charSequence, i4, i3, rect3);
        } else {
            textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        }
        return rect3;
    }

    public static final float b(int i2, int i3, float[] fArr) {
        return fArr[((i2 - i3) * 2) + 1];
    }

    public static final int c(Layout layout, int i2, boolean z3) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i2 || layout.getLineEnd(lineForOffset) == i2) ? lineStart == i2 ? z3 ? lineForOffset - 1 : lineForOffset : z3 ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }

    public static final int d(D d3, Layout layout, Q1.e eVar, int i2, RectF rectF, E0.e eVar2, C0018a c0018a, boolean z3) {
        p[] pVarArr;
        int i3;
        p[] pVarArr2;
        int i4;
        int i5;
        int b3;
        int i6;
        int a3;
        Bidi createLineBidi;
        boolean z4;
        float a4;
        float a5;
        int lineTop = layout.getLineTop(i2);
        int lineBottom = layout.getLineBottom(i2);
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i7 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i7];
        Layout layout2 = d3.f949f;
        int lineStart2 = layout2.getLineStart(i2);
        int f3 = d3.f(i2);
        if (i7 < (f3 - lineStart2) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2".toString());
        }
        n nVar = new n(d3);
        boolean z5 = false;
        boolean z6 = layout2.getParagraphDirection(i2) == 1;
        int i8 = 0;
        while (lineStart2 < f3) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z6 && !isRtlCharAt) {
                a4 = nVar.a(lineStart2, z5, z5, true);
                a5 = nVar.a(lineStart2 + 1, true, true, true);
                z4 = z6;
            } else if (z6 && isRtlCharAt) {
                z4 = z6;
                a5 = nVar.a(lineStart2, false, false, false);
                a4 = nVar.a(lineStart2 + 1, true, true, false);
            } else {
                z4 = z6;
                if (isRtlCharAt) {
                    float a6 = nVar.a(lineStart2, false, false, true);
                    a4 = nVar.a(lineStart2 + 1, true, true, true);
                    a5 = a6;
                } else {
                    a4 = nVar.a(lineStart2, false, false, false);
                    a5 = nVar.a(lineStart2 + 1, true, true, false);
                }
            }
            fArr[i8] = a4;
            fArr[i8 + 1] = a5;
            i8 += 2;
            lineStart2++;
            z6 = z4;
            z5 = false;
        }
        Layout layout3 = (Layout) eVar.f5277a;
        int lineStart3 = layout3.getLineStart(i2);
        int lineEnd2 = layout3.getLineEnd(i2);
        int g3 = eVar.g(lineStart3, false);
        int h2 = eVar.h(g3);
        int i9 = lineStart3 - h2;
        int i10 = lineEnd2 - h2;
        Bidi d4 = eVar.d(g3);
        if (d4 == null || (createLineBidi = d4.createLineBidi(i9, i10)) == null) {
            pVarArr = new p[]{new p(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            pVarArr = new p[runCount];
            int i11 = 0;
            while (i11 < runCount) {
                int i12 = runCount;
                pVarArr[i11] = new p(createLineBidi.getRunStart(i11) + lineStart3, createLineBidi.getRunLimit(i11) + lineStart3, createLineBidi.getRunLevel(i11) % 2 == 1);
                i11++;
                runCount = i12;
            }
        }
        E2.b dVar = z3 ? new E2.d(0, pVarArr.length - 1, 1) : new E2.b(pVarArr.length - 1, 0, -1);
        int i13 = dVar.f1076h;
        int i14 = dVar.f1077i;
        int i15 = dVar.f1078j;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return -1;
        }
        while (true) {
            p pVar = pVarArr[i13];
            boolean z7 = pVar.f979c;
            int i16 = pVar.f977a;
            int i17 = pVar.f978b;
            float f4 = z7 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
            float b4 = z7 ? b(i16, lineStart, fArr) : b(i17 - 1, lineStart, fArr);
            boolean z8 = pVar.f979c;
            if (z3) {
                float f5 = rectF.left;
                if (b4 >= f5) {
                    pVarArr2 = pVarArr;
                    float f6 = rectF.right;
                    if (f4 <= f6) {
                        if ((z8 || f5 > f4) && (!z8 || f6 < b4)) {
                            int i18 = i16;
                            i6 = i17;
                            while (true) {
                                i3 = i15;
                                if (i6 - i18 <= 1) {
                                    break;
                                }
                                int i19 = (i6 + i18) / 2;
                                float f7 = fArr[(i19 - lineStart) * 2];
                                if ((z8 || f7 <= rectF.left) && (!z8 || f7 >= rectF.right)) {
                                    i18 = i19;
                                } else {
                                    i6 = i19;
                                }
                                i15 = i3;
                            }
                            if (!z8) {
                                i6 = i18;
                            }
                        } else {
                            i3 = i15;
                            i6 = i16;
                        }
                        int b5 = eVar2.b(i6);
                        if (b5 != -1 && (a3 = eVar2.a(b5)) < i17) {
                            if (a3 >= i16) {
                                i16 = a3;
                            }
                            if (b5 > i17) {
                                b5 = i17;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i20 = b5;
                            while (true) {
                                rectF2.left = z8 ? fArr[((i20 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
                                rectF2.right = z8 ? b(i16, lineStart, fArr) : b(i20 - 1, lineStart, fArr);
                                if (!((Boolean) c0018a.j(rectF2, rectF)).booleanValue()) {
                                    i16 = eVar2.c(i16);
                                    if (i16 == -1 || i16 >= i17) {
                                        break;
                                    }
                                    i20 = eVar2.b(i16);
                                    if (i20 > i17) {
                                        i20 = i17;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    } else {
                        i3 = i15;
                    }
                } else {
                    i3 = i15;
                    pVarArr2 = pVarArr;
                }
                i16 = -1;
            } else {
                i3 = i15;
                pVarArr2 = pVarArr;
                float f8 = rectF.left;
                if (b4 >= f8) {
                    float f9 = rectF.right;
                    if (f4 <= f9) {
                        if ((z8 || f9 < b4) && (!z8 || f8 > f4)) {
                            int i21 = i16;
                            int i22 = i17;
                            while (i22 - i21 > 1) {
                                int i23 = (i22 + i21) / 2;
                                float f10 = fArr[(i23 - lineStart) * 2];
                                int i24 = i22;
                                if ((z8 || f10 <= rectF.right) && (!z8 || f10 >= rectF.left)) {
                                    i22 = i24;
                                    i21 = i23;
                                } else {
                                    i22 = i23;
                                }
                            }
                            i5 = z8 ? i22 : i21;
                        } else {
                            i5 = i17 - 1;
                        }
                        int a7 = eVar2.a(i5 + 1);
                        if (a7 != -1 && (b3 = eVar2.b(a7)) > i16) {
                            if (a7 < i16) {
                                a7 = i16;
                            }
                            if (b3 <= i17) {
                                i17 = b3;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i25 = a7;
                            while (true) {
                                rectF3.left = z8 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i25 - lineStart) * 2];
                                rectF3.right = z8 ? b(i25, lineStart, fArr) : b(i17 - 1, lineStart, fArr);
                                if (!((Boolean) c0018a.j(rectF3, rectF)).booleanValue()) {
                                    i17 = eVar2.d(i17);
                                    if (i17 == -1 || i17 <= i16) {
                                        break;
                                    }
                                    i25 = eVar2.a(i17);
                                    if (i25 < i16) {
                                        i25 = i16;
                                    }
                                } else {
                                    i4 = i17;
                                    break;
                                }
                            }
                        }
                    }
                }
                i4 = -1;
                i16 = i4;
            }
            if (i16 >= 0) {
                return i16;
            }
            if (i13 == i14) {
                return -1;
            }
            i13 += i3;
            pVarArr = pVarArr2;
            i15 = i3;
        }
    }

    public static final boolean e(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
