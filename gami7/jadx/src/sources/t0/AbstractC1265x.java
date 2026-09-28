package t0;

import android.R;
import s.AbstractC1166e;

/* renamed from: t0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1265x {
    public static /* synthetic */ boolean a(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case AbstractC1166e.f10138f /* 5 */:
            case AbstractC1166e.f10136d /* 6 */:
            case 7:
            case 8:
            case AbstractC1166e.f10135c /* 9 */:
            case AbstractC1166e.f10137e /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case AbstractC1166e.f10139g /* 15 */:
            case 16:
            case 17:
                return false;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return true;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                return false;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                return true;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int b(int i2) {
        if (i2 == 1) {
            return R.string.cut;
        }
        if (i2 == 2) {
            return R.string.copy;
        }
        if (i2 == 3) {
            return R.string.paste;
        }
        if (i2 == 4) {
            return R.string.selectAll;
        }
        throw null;
    }

    public static String d(int i2, int i3, String str, String str2) {
        return str + i2 + str2 + i3;
    }

    public static /* synthetic */ void e(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void f(String str, int i2) {
        if (i2 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = z2.h.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            z2.h.i(nullPointerException, z2.h.class.getName());
            throw nullPointerException;
        }
    }

    public static /* synthetic */ String g(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }
}
