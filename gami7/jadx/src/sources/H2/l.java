package H2;

import B1.t;
import java.util.ArrayList;
import java.util.List;
import n2.AbstractC0959k;
import n2.AbstractC0962n;
import n2.AbstractC0964p;

/* loaded from: classes.dex */
public abstract class l extends j {
    public static boolean O(CharSequence charSequence, String str, boolean z3) {
        z2.h.f(charSequence, "<this>");
        z2.h.f(str, "other");
        return U(charSequence, str, 0, z3, 2) >= 0;
    }

    public static boolean P(String str, String str2, boolean z3) {
        return str == null ? str2 == null : !z3 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final int Q(CharSequence charSequence) {
        z2.h.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int R(CharSequence charSequence, String str, int i2, boolean z3) {
        z2.h.f(charSequence, "<this>");
        z2.h.f(str, "string");
        return (z3 || !(charSequence instanceof String)) ? S(charSequence, str, i2, charSequence.length(), z3, false) : ((String) charSequence).indexOf(str, i2);
    }

    public static final int S(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z3, boolean z4) {
        E2.b bVar;
        if (z4) {
            int Q3 = Q(charSequence);
            if (i2 > Q3) {
                i2 = Q3;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            bVar = new E2.b(i2, i3, -1);
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            bVar = new E2.d(i2, i3, 1);
        }
        boolean z5 = charSequence instanceof String;
        int i4 = bVar.f1078j;
        int i5 = bVar.f1077i;
        int i6 = bVar.f1076h;
        if (z5 && (charSequence2 instanceof String)) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                while (!Y((String) charSequence2, 0, (String) charSequence, i6, ((String) charSequence2).length(), z3)) {
                    if (i6 != i5) {
                        i6 += i4;
                    }
                }
                return i6;
            }
        } else if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            while (!Z(charSequence2, 0, charSequence, i6, charSequence2.length(), z3)) {
                if (i6 != i5) {
                    i6 += i4;
                }
            }
            return i6;
        }
        return -1;
    }

    public static int T(CharSequence charSequence, char c3, int i2, boolean z3, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        z2.h.f(charSequence, "<this>");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c3, i2);
        }
        char[] cArr = {c3};
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC0959k.z(cArr), i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int Q3 = Q(charSequence);
        if (i2 <= Q3) {
            while (!B2.a.n(cArr[0], charSequence.charAt(i2), z3)) {
                if (i2 != Q3) {
                    i2++;
                }
            }
            return i2;
        }
        return -1;
    }

    public static /* synthetic */ int U(CharSequence charSequence, String str, int i2, boolean z3, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        return R(charSequence, str, i2, z3);
    }

    public static boolean V(CharSequence charSequence) {
        z2.h.f(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!B2.a.w(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int W(CharSequence charSequence, char c3) {
        int Q3 = Q(charSequence);
        z2.h.f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c3, Q3);
        }
        char[] cArr = {c3};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(AbstractC0959k.z(cArr), Q3);
        }
        int Q4 = Q(charSequence);
        if (Q3 > Q4) {
            Q3 = Q4;
        }
        while (-1 < Q3) {
            if (B2.a.n(cArr[0], charSequence.charAt(Q3), false)) {
                return Q3;
            }
            Q3--;
        }
        return -1;
    }

    public static b X(CharSequence charSequence, String[] strArr, boolean z3, int i2) {
        c0(i2);
        return new b(charSequence, 0, i2, new k(AbstractC0959k.n(strArr), z3));
    }

    public static final boolean Y(String str, int i2, String str2, int i3, int i4, boolean z3) {
        z2.h.f(str, "<this>");
        z2.h.f(str2, "other");
        return !z3 ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z3, i2, str2, i3, i4);
    }

    public static final boolean Z(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z3) {
        z2.h.f(charSequence, "<this>");
        z2.h.f(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!B2.a.n(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z3)) {
                return false;
            }
        }
        return true;
    }

    public static String a0() {
        int length = "H".length();
        if (length == 0) {
            return "";
        }
        int i2 = 1;
        if (length == 1) {
            char charAt = "H".charAt(0);
            char[] cArr = new char[10];
            for (int i3 = 0; i3 < 10; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder("H".length() * 10);
        while (true) {
            sb.append((CharSequence) "H");
            if (i2 == 10) {
                String sb2 = sb.toString();
                z2.h.c(sb2);
                return sb2;
            }
            i2++;
        }
    }

    public static String b0(String str, String str2, String str3) {
        z2.h.f(str, "<this>");
        z2.h.f(str2, "oldValue");
        z2.h.f(str3, "newValue");
        int R3 = R(str, str2, 0, false);
        if (R3 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, R3);
            sb.append(str3);
            i3 = R3 + length;
            if (R3 >= str.length()) {
                break;
            }
            R3 = R(str, str2, R3 + i2, false);
        } while (R3 > 0);
        sb.append((CharSequence) str, i3, str.length());
        String sb2 = sb.toString();
        z2.h.e(sb2, "toString(...)");
        return sb2;
    }

    public static final void c0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(t.h("Limit must be non-negative, but was ", i2).toString());
        }
    }

    public static List d0(CharSequence charSequence, String[] strArr) {
        z2.h.f(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                c0(0);
                int R3 = R(charSequence, str, 0, false);
                if (R3 == -1) {
                    return AbstractC0962n.l(charSequence.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int i2 = 0;
                do {
                    arrayList.add(charSequence.subSequence(i2, R3).toString());
                    i2 = str.length() + R3;
                    R3 = R(charSequence, str, i2, false);
                } while (R3 != -1);
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                return arrayList;
            }
        }
        b<E2.d> X3 = X(charSequence, strArr, false, 0);
        ArrayList arrayList2 = new ArrayList(AbstractC0964p.z(new G2.l(0, X3), 10));
        for (E2.d dVar : X3) {
            z2.h.f(dVar, "range");
            arrayList2.add(charSequence.subSequence(dVar.f1076h, dVar.f1077i + 1).toString());
        }
        return arrayList2;
    }

    public static boolean e0(String str, String str2) {
        z2.h.f(str, "<this>");
        return str.startsWith(str2);
    }

    public static String f0(String str, String str2) {
        z2.h.f(str, "<this>");
        z2.h.f(str2, "delimiter");
        z2.h.f(str, "missingDelimiterValue");
        int U3 = U(str, str2, 0, false, 6);
        if (U3 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + U3, str.length());
        z2.h.e(substring, "substring(...)");
        return substring;
    }

    public static String g0(String str) {
        z2.h.f(str, "<this>");
        z2.h.f(str, "missingDelimiterValue");
        int W3 = W(str, '.');
        if (W3 == -1) {
            return str;
        }
        String substring = str.substring(W3 + 1, str.length());
        z2.h.e(substring, "substring(...)");
        return substring;
    }

    public static CharSequence h0(String str) {
        z2.h.f(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length) {
            boolean w2 = B2.a.w(str.charAt(!z3 ? i2 : length));
            if (z3) {
                if (!w2) {
                    break;
                }
                length--;
            } else if (w2) {
                i2++;
            } else {
                z3 = true;
            }
        }
        return str.subSequence(i2, length + 1);
    }
}
