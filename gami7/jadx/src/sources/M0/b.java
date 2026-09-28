package M0;

import B.y;
import J.C0257c;
import J.C0274k0;
import J.F;
import J.W;
import K0.j;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b0.f;
import c0.AbstractC0574N;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0574N f4753a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4754b;

    /* renamed from: c, reason: collision with root package name */
    public final C0274k0 f4755c = C0257c.N(new f(9205357640488583168L), W.f4109m);

    /* renamed from: d, reason: collision with root package name */
    public final F f4756d = C0257c.F(new y(16, this));

    public b(AbstractC0574N abstractC0574N, float f3) {
        this.f4753a = abstractC0574N;
        this.f4754b = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.c(textPaint, this.f4754b);
        textPaint.setShader((Shader) this.f4756d.getValue());
    }
}
