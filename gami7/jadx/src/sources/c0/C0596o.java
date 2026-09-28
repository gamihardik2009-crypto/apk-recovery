package c0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import s.AbstractC1166e;

/* renamed from: c0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0596o f7267a = new C0596o();

    public final BlendModeColorFilter a(long j3, int i2) {
        AbstractC0595n.d();
        return AbstractC0595n.a(AbstractC0571K.A(j3), AbstractC0571K.w(i2));
    }

    public final C0594m b(BlendModeColorFilter blendModeColorFilter) {
        int color;
        BlendMode mode;
        int ordinal;
        int i2;
        color = blendModeColorFilter.getColor();
        long c3 = AbstractC0571K.c(color);
        mode = blendModeColorFilter.getMode();
        int[] iArr = AbstractC0583b.f7244a;
        ordinal = mode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
            default:
                i2 = 3;
                break;
            case AbstractC1166e.f10138f /* 5 */:
                i2 = 4;
                break;
            case AbstractC1166e.f10136d /* 6 */:
                i2 = 5;
                break;
            case 7:
                i2 = 6;
                break;
            case 8:
                i2 = 7;
                break;
            case AbstractC1166e.f10135c /* 9 */:
                i2 = 8;
                break;
            case AbstractC1166e.f10137e /* 10 */:
                i2 = 9;
                break;
            case 11:
                i2 = 10;
                break;
            case 12:
                i2 = 11;
                break;
            case 13:
                i2 = 12;
                break;
            case 14:
                i2 = 13;
                break;
            case AbstractC1166e.f10139g /* 15 */:
                i2 = 14;
                break;
            case 16:
                i2 = 15;
                break;
            case 17:
                i2 = 16;
                break;
            case 18:
                i2 = 17;
                break;
            case 19:
                i2 = 18;
                break;
            case 20:
                i2 = 19;
                break;
            case 21:
                i2 = 20;
                break;
            case 22:
                i2 = 21;
                break;
            case 23:
                i2 = 22;
                break;
            case 24:
                i2 = 23;
                break;
            case 25:
                i2 = 24;
                break;
            case 26:
                i2 = 25;
                break;
            case 27:
                i2 = 26;
                break;
            case 28:
                i2 = 27;
                break;
            case 29:
                i2 = 28;
                break;
        }
        return new C0594m(c3, i2, blendModeColorFilter);
    }
}
